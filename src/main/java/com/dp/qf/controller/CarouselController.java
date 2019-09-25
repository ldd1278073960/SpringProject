package com.dp.qf.controller;

import com.dp.qf.domain.entity.Carousel;
import com.dp.qf.service.CarouselService;
import com.dp.qf.utils.Result;
import lombok.extern.slf4j.Slf4j;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import javax.annotation.Resource;
import java.util.List;

/**
 * @author Administrator
 */
@RestController
@RequestMapping("/api")
@Slf4j
public class CarouselController{

    @Resource
    private CarouselService service;

    @RequestMapping("/carousel")
    public Result findByCarousel(){
        try {
            List<Carousel> byCarousel = service.findByCarousel();
            return Result.success(byCarousel);
        }catch (Exception e){
            log.error("错误");
            return Result.error();
        }

    }

}

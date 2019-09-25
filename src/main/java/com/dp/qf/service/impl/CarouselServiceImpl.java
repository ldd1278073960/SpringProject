package com.dp.qf.service.impl;

import com.dp.qf.domain.entity.Carousel;
import com.dp.qf.mapper.CarouselMapper;
import com.dp.qf.service.CarouselService;
import org.springframework.stereotype.Service;

import javax.annotation.Resource;
import java.util.List;

/**
 * @author Administrator
 */
@Service
public class CarouselServiceImpl implements CarouselService {

    @Resource
    private CarouselMapper carouselMapper;


    /**
     * 电影轮播图
     */
    @Override
    public List<Carousel> findByCarousel() {
        List<Carousel> carousel = carouselMapper.findByCarousel();
        return carousel;
    }
}

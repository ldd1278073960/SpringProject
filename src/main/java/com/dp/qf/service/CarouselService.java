package com.dp.qf.service;

import com.dp.qf.domain.entity.Carousel;

import java.util.List;

/**
 * @author Administrator
 */
public interface CarouselService {

    /**
     * 首页轮播图
     * @return
     */
    List<Carousel> findByCarousel();

}

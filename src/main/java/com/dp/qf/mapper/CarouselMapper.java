package com.dp.qf.mapper;

import com.dp.qf.domain.entity.Carousel;

import java.util.List;

/**
 * @author Administrator
 * 首页轮播图
 */
public interface CarouselMapper {

    /**
     * 首页轮播图
     * @return
     */
    List<Carousel> findByCarousel();

}

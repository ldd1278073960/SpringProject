package com.dp.qf.domain.vo;

import com.dp.qf.domain.entity.Carousel;
import com.dp.qf.domain.entity.Film;
import com.dp.qf.domain.entity.Picture;
import lombok.Data;

import java.util.List;

/**
 * @author Administrator
 */
@Data
public class CarouselVo extends Carousel {

    List<Carousel> carousels;

    List<Film> films;
    List<Picture> pictures;

}

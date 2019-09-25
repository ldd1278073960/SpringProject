package com.dp.qf.domain.vo;

import com.dp.qf.domain.entity.Carousel;
import com.dp.qf.domain.entity.Film;
import com.dp.qf.domain.entity.Picture;
import lombok.Data;
import lombok.EqualsAndHashCode;

import java.util.List;

/**
 * @author Administrator
 * 如果只使用@Data，会导致有可能出现问题
 *
 * 比如，有多个类有相同的部分属性，把它们定义到父类中，恰好id（数据库主键）也在父类中，那么就会存在部分对象在比较时，它们并不相等，却因为lombok自动生成的equals(Object other) 和 hashCode()方法判定为相等，从而导致出错。
 *
 *
 *
 * 修复此问题的方法很简单：
 *
 * 1. 使用@Getter @Setter @ToString代替@Data并且自定义equals(Object other) 和 hashCode()方法，比如有些类只需要判断主键id是否相等即足矣。
 *
 * 2. 或者使用在使用@Data时同时加上@EqualsAndHashCode(callSuper=true)注解。
 */

@EqualsAndHashCode(callSuper = true)
@Data

public class CarouselVo extends Carousel {

    List<Carousel> carousels;

    List<Film> films;

    List<Picture> pictures;

}

package com.dp.qf.domain.entity;

import lombok.Data;

@Data
public class Film {

    private Integer filmId;

    private Integer pictureId;

    private String filmName;

    private Integer filmGrade;

    private String filmSynopsis;

    private String filmBoxOffice;

    private String filmDate;

    private String filmViewCounts;

    private Integer filmStatus;

}

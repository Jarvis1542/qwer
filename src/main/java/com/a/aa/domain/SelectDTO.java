package com.a.aa.domain;

import lombok.Data;

import java.util.Date;

@Data
public class SelectDTO {
    private long bno;
    private String title;
    private String writer;
    private Date regDate;
    private int count;
    private String content;
    private int noReco;
    private int exReco;
}
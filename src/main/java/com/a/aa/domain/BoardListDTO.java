package com.a.aa.domain;

import lombok.Data;

import java.util.Date;

@Data
public class BoardListDTO {
    private long bno;
    private String title;
    private String writer;
    private Date regDate;
    private int noReco;
    private int exReco;
    private int count;
}

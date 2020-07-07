package com.a.aa.domain;

import lombok.Data;

@Data
public class UpdateDTO {
    private long bno;
    private String title;
    private String writer;
    private String content;
}

package com.a.aa.domain;

import lombok.Data;
import lombok.Getter;
@Data
public class RecoDTO {
    private long bno;
    private String mtype;

    public long getBno() {
        return bno;
    }

    public void setBno(long bno) {
        this.bno = bno;
    }

    public String getMtype() {
        return mtype;
    }

    public void setMtype(String mtype) {
        this.mtype = mtype;
    }
}

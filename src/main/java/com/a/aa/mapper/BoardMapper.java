package com.a.aa.mapper;

import com.a.aa.domain.*;

import java.util.ArrayList;

public interface BoardMapper {
    void write(WriteDTO writeDTO);
    ArrayList<BoardListDTO> boardList();
    SelectDTO select(long bno);
    void count(long bno);
    void noReco(RecoDTO recoDTO);
    void exReco(RecoDTO recoDTO);
    void delete(DeleteDTO deleteDTO);
    void update(UpdateDTO updateDTO);
    void reply(ReplyDTO replyDTO);
    ArrayList<ReplyListDTO> replyList(long bno);
}
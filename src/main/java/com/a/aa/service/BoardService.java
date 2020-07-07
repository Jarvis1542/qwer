package com.a.aa.service;

import com.a.aa.domain.*;
import com.a.aa.mapper.BoardMapper;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.ArrayList;

@Service
public class BoardService {
    @Autowired(required = false)
    BoardMapper boardMapper;

    public void write(WriteDTO writeDTO){
        boardMapper.write(writeDTO);
    }

    public ArrayList<BoardListDTO> boardList(){
        return boardMapper.boardList();
    }

    public SelectDTO select(long bno){
        return boardMapper.select(bno);
    }

    public void count(long bno){
        boardMapper.count(bno);
    }

    public void reco(RecoDTO recoDTO){
        if(recoDTO.getMtype().equals("일반")){
            boardMapper.noReco(recoDTO);
        }else{
            boardMapper.exReco(recoDTO);
        }
    }

    public void delete(DeleteDTO deleteDTO){
        boardMapper.delete(deleteDTO);
    }

    public void update(UpdateDTO updateDTO){
        boardMapper.update(updateDTO);
    }

    public void reply(ReplyDTO replyDTO){
        boardMapper.reply(replyDTO);
    }

    public ArrayList<ReplyListDTO> replyList(long bno){
        return boardMapper.replyList(bno);
    }
}

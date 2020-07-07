package com.a.aa.controller;

import com.a.aa.domain.*;
import com.a.aa.service.BoardService;
import com.a.aa.service.MemberService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class IndexRestController {
    @Autowired
    MemberService memberService;
    @Autowired
    BoardService boardService;

    @PostMapping("/rest/join")
    public void join(JoinDTO joinDTO){
        System.out.println("join restController : " + joinDTO.toString());
        memberService.join(joinDTO);
    }

    @PostMapping("/rest/write")
    public void write(WriteDTO writeDTO){
        System.out.println("write restController : " + writeDTO.toString());
        boardService.write(writeDTO);
    }

    @PutMapping("/rest/reco")
    public void reco(RecoDTO recoDTO){
        System.out.println("reco restController : " + recoDTO.toString());
        boardService.reco(recoDTO);
    }

    @DeleteMapping("/rest/delete")
    public void delete(DeleteDTO deleteDTO){
        System.out.println("delete restController : " + deleteDTO.toString());
        boardService.delete(deleteDTO);
    }

    @PutMapping("/rest/update")
    public void update(UpdateDTO updateDTO){
        System.out.println("update restController : "+ updateDTO.toString());
        boardService.update(updateDTO);
    }

    @PostMapping("/rest/reply")
    public void reply(ReplyDTO replyDTO){
        System.out.println("reply restController : " + replyDTO.toString());
        boardService.reply(replyDTO);
    }
}

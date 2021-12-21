package com.goonoo.demoproject.controller;

import com.goonoo.demoproject.domain.BoardVO;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class BoardController {

    public BoardController() {
        System.out.println("===> BoardController 생성");
    }

    @GetMapping("/hello")
    public String hello(String name){
        BoardVO boardVO = new BoardVO();

        System.out.println(boardVO);

        return "Hello : " + name;
    }
}

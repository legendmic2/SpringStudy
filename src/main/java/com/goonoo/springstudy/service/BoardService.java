package com.goonoo.springstudy.service;

import com.goonoo.springstudy.domain.BoardVO;

import java.util.List;

public interface BoardService {

    String hello(String name);

    BoardVO getBoard();

    List<BoardVO> getBoardList();
}

package com.personal.service;

import java.util.List;

import com.personal.domain.vo.BoardVO;

public interface BoardSerivce {
    
    public void register();

    public BoardVO get(Long bno);

    public List<BoardVO> getList();

    public boolean modify(BoardVO boardVO);

    public boolean remove(Long bno);
}

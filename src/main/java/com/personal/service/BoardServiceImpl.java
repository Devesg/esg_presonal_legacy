package com.personal.service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.personal.domain.vo.BoardVO;
import com.personal.mapper.BoardMapper;

import lombok.AllArgsConstructor;
import lombok.Setter;
import lombok.extern.log4j.Log4j;

@AllArgsConstructor
@Log4j
@Service
public class BoardServiceImpl implements BoardSerivce{

    @Setter(onMethod_ = @Autowired)
    private BoardMapper mapper;

    @Override
    public BoardVO get(Long bno) {
        // TODO Auto-generated method stub
        return null;
    }

    @Override
    public List<BoardVO> getList() {
        // TODO Auto-generated method stub
        return null;
    }

    @Override
    public boolean modify(BoardVO boardVO) {
        // TODO Auto-generated method stub
        return false;
    }

    @Override
    public void register() {
        // TODO Auto-generated method stub
        
    }

    @Override
    public boolean remove(Long bno) {
        // TODO Auto-generated method stub
        return false;
    }

}

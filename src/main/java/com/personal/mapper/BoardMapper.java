package com.personal.mapper;

import java.util.List;

import org.apache.ibatis.annotations.Select;

import com.personal.domain.vo.BoardVO;

public interface BoardMapper {

	//@Select("SELECT * FROM mydb.board where bno > 0")
	public List<BoardVO> getList();

	public void insert(BoardVO board);

	public BoardVO read(Long bno);

	public int delete(Long bno);

	public int update(BoardVO board);
}

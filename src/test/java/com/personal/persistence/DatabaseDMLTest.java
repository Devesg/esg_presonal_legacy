package com.personal.persistence;

import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.test.context.ContextConfiguration;
import org.springframework.test.context.junit4.SpringJUnit4ClassRunner;

import com.personal.config.RootConfig;
import com.personal.domain.vo.BoardVO;
import com.personal.mapper.BoardMapper;

import lombok.Setter;
import lombok.extern.log4j.Log4j;

@RunWith(SpringJUnit4ClassRunner.class)
@ContextConfiguration(classes = { RootConfig.class })
@Log4j
public class DatabaseDMLTest {

	@Setter(onMethod_ = { @Autowired })
	private BoardMapper mapper;

	@Test
	public void 게시글추가테스트() {
		BoardVO boardVO = BoardVO.builder().title("제목").content("내용").writer("작성자").build();
		mapper.insert(boardVO);
		log.info(boardVO);
	}
	@Test
	public void 게시글조회테스트() {
		BoardVO boardVO = mapper.read(19L);
		log.info(boardVO);
	}
}

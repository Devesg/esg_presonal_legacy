package com.personal.persistence;

import static org.junit.Assert.fail;

import java.sql.Connection;
import java.sql.SQLException;

import javax.sql.DataSource;

import org.apache.ibatis.session.SqlSession;
import org.apache.ibatis.session.SqlSessionFactory;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.test.context.ContextConfiguration;
import org.springframework.test.context.junit4.SpringJUnit4ClassRunner;

import com.personal.config.RootConfig;
import com.personal.mapper.Mapper;

import lombok.Setter;
import lombok.extern.log4j.Log4j;

@RunWith(SpringJUnit4ClassRunner.class)
@ContextConfiguration(classes = { RootConfig.class })
@Log4j
public class DataSourceTests {

	@Setter(onMethod_ = { @Autowired })
	private SqlSessionFactory sqlSessionFactory;

	@Setter(onMethod_ = { @Autowired })
	private DataSource dataSource;

	@Setter(onMethod_ = { @Autowired })
	private Mapper mapper;

	@Test
	public void testConnection() {
		try {
			SqlSession sqlSession = sqlSessionFactory.openSession();
			Connection con = dataSource.getConnection();
			log.info(sqlSession);
			log.info(con);
			log.info(mapper.getClass().getName());
			log.info(mapper.getTime());
			log.info("getTime2");
			log.info(mapper.getTime2());
		} catch (SQLException e) {
			fail(e.getMessage());
		}
	}

}
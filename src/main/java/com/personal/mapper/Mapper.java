package com.personal.mapper;

import org.apache.ibatis.annotations.Select;

public interface Mapper {
	@Select("select sysdate()")
	public String getTime();

	public String getTime2();
}

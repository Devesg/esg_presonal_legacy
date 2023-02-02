package com.personal.aop;

import java.lang.annotation.ElementType;
import java.lang.annotation.Retention;
import java.lang.annotation.RetentionPolicy;
import java.lang.annotation.Target;

/**
 * @LoginCheck : 현재 사용자가 로그인 한 사용자인지 확인한다.
 * @Retention : 어느 시점까지 어노테이션의 메모리를 가져갈 지 설정
 * @Target : 어노테이션이 사용될 위치를 지정한다.
 */

@Retention(RetentionPolicy.RUNTIME)
@Target(ElementType.METHOD)
public @interface LoginCheck {

	/**
	 * 로그인을 체크하고 싶은 유저의 로그인 타입
	 * 
	 * @return
	 */
	UserType type() default UserType.UNKNOWN;

	public static enum UserType {
		UNKNOWN, MEMBER, ADMIN
	}
}

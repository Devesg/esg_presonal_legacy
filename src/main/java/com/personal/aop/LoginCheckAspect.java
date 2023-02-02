package com.personal.aop;

import javax.servlet.http.HttpSession;

import org.aspectj.lang.annotation.Aspect;
import org.aspectj.lang.annotation.Before;
import org.springframework.stereotype.Component;
import org.springframework.web.context.request.RequestContextHolder;
import org.springframework.web.context.request.ServletRequestAttributes;

import lombok.extern.slf4j.Slf4j;

@Slf4j
@Component
@Aspect
public class LoginCheckAspect {

	// CheckLogin 어노테이션이 붙은 메소드가 실행하기 전 해당 로직을 실행
	@Before("@annotation(com.aqh.aop.LoginCheck) && @annotation(loginCheck)")
	public void loginCheck(LoginCheck loginCheck) throws Throwable {
		log.info("AOP - Login Check Started");
		HttpSession session = ((ServletRequestAttributes) (RequestContextHolder.currentRequestAttributes()))
				.getRequest().getSession();
		String id = (String) session.getAttribute("id");
		log.info("아이디 : " + id + "회원 정보 : " + loginCheck.type());
	}

}

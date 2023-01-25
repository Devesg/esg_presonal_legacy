package com.personal.controller;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;

import lombok.extern.log4j.Log4j;

@Log4j
@Controller
@RequestMapping("/sample/*")
public class SampleController {

	@RequestMapping(value = "")
	public void basic() {
		log.info("basic......");
	}

}
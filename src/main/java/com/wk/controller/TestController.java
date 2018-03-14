package com.wk.controller;

import org.apache.log4j.Logger;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;


@RestController
public class TestController {
	private static Logger logger = Logger.getLogger(TestController.class);

	@GetMapping("/")
	public String test(){
		logger.info("ssssss");
		logger.error("xxxxxx");
		return "111111";
	}
}

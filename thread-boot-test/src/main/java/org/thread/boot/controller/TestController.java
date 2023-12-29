package org.thread.boot.controller;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

/**
 * 测试
 * @author thread
 * @date 2023/12/29 14:40
 */
@RestController
public class TestController {
	@GetMapping("hello")
	public String hello() {
		return "<h1>hello !</h1>";
	}
}

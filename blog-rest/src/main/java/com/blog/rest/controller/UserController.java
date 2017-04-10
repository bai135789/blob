package com.blog.rest.controller;

import java.util.HashMap;
import java.util.Map;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;

@Controller
@RequestMapping("/user")
public class UserController {

	@RequestMapping("/login")
	@ResponseBody
	public Map<Object, Object> login() {
		Map<Object, Object> userMap = new HashMap<>();
		userMap.put("username", "zhangsan");
		userMap.put("password", "123456");
		return userMap;
	}

}

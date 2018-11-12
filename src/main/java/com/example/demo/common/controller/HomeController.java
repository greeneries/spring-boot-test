package com.example.demo.common.controller;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;

// jsp로 리턴할 때 사용 
@Controller
public class HomeController {
	

	// URL : http://localhost:8088/hello-world/
	@RequestMapping("/")
	public String home(){
		
		/*
		 * application.properties 파일에 아래와 같은 설정을 해줘야만 /WEB-INF/views/welcome.jsp로 리턴된다. 
		 * spring.mvc.view.prefix=/WEB-INF/views/
		 * spring.mvc.view.suffix=.jsp
		 */
		return "welcome";
	}
}
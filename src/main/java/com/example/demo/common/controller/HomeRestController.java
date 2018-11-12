package com.example.demo.common.controller;

import java.util.HashMap;
import java.util.Map;

import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.google.gson.Gson;

// @RestController : client와 json 포맷의 문자열로 대화하는 클래스를 의미함 
// 1. 객체를 리턴하면 jackson 라이브러리를 사용해서 JSON 포맷의 문자열로 변경한 후, 클라이언트에게 전달한다.
// 2. String을 리턴하면 그대로 클라이언트에게 전달된다. 
@RestController
public class HomeRestController {
	
	// URL : http://localhost:8088/hello-world/?plain
	@RequestMapping(value={"/"}, params="plain")
	public String homeForPlain(){
		return "welcome plain";
	}
	
	
	// URL : http://localhost:8088/hello-world/?json
	@RequestMapping(value={"/"}, params="json")
	public String homeForJson(){
		return "{\"message\" : \"welcome json\"}";
	}
	
	
	// http://localhost:8088/hello-world/?json2
	@RequestMapping(value={"/"}, params="json2")
	public Object exampleObjectToJson(){
		Map<String, Object> map = new HashMap<>();
		map.put("apple", "사과");
		// 리턴 값이 객체인 경우, spring이 JSON 포맷의 문자열로 변경하여 
		// 클라이언트에게 전달한다.
		return map;
	}
	
	// http://localhost:8088/hello-world/?gson3
	@RequestMapping(value={"/"}, params="json3")
	public String exampleUsingGsonObjectToJson(){
		Map<String, Object> map = new HashMap<>();
		map.put("banana", "바나나");
		Gson gson = new Gson();
		
		// gson을 사용하여 리턴 값이 객체인 경우, spring이 JSON 포맷의 문자열로 변경하여 
		// 클라이언트에게 전달한다.
		return gson.toJson(map);
	}
	
}
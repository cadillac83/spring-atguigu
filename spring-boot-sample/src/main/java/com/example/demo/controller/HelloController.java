package com.example.demo.controller;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/hello")	
public class HelloController {

	@RequestMapping
	public String hello(){
		return "Hello Spring-boot";
	}
	
	@RequestMapping("/info")
	public Map<String, String> getInfo(@RequestParam String name){
		Map<String, String> map = new HashMap<>();
		map.put("name", name);
		return map;
	}
	
	@RequestMapping("/list")
	public List<Map<String, String>> getList(){
		List<Map<String, String>> list = new ArrayList<>();
		Map<String, String> map = null;
		for (int i = 0; i < 5; i++) {
			map = new HashMap<>();
			map.put("name", "Sam-"+i);
			list.add(map);
		}
		return list;
	}
}

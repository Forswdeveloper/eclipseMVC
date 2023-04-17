package com.springmvc.example01;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;

@Controller
@RequestMapping("/exam02")
public class ClassRequestMapping {
	
	//클래스 수준의 RequsetMapping
	@RequestMapping
	public void requestMethod() {
		System.out.println("@RequsetMapping 예제입니다.");
		System.out.println("웹 요청 URL은 /exam02 입니다.");
	}
}
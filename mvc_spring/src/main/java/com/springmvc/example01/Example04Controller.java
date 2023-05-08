package com.springmvc.example01;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;

@Controller
@RequestMapping("/exam04")
public class Example04Controller {
	
	@GetMapping("/home")
	public void requestMethod() {
		System.out.println(" @RequestMapping 예제입니다.");
		System.out.println(" 웹 요청 URL은 /home/exam04 입니다.");
	}
	
	@GetMapping("/login")
	public String requestMethodLogin() {
		return "loginform";
	}
	
	@GetMapping("/admin")
	public String requestMethodAdmin() {
		return "webpage08_04";
	}
	
	@GetMapping("logout")
	public String requsetMethodLogout() {
		return "loginform";
	}
}

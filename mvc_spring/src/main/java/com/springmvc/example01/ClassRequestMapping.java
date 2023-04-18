package com.springmvc.example01;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;

@Controller
@RequestMapping("/homes")
public class ClassRequestMapping {
	
	//클래스 수준의 RequsetMapping
	@RequestMapping("/exam02/{category}/publisher/{publisher}")
	public String requestMethod(@PathVariable String category, @PathVariable String publisher, Model model) {
		System.out.println("도서분야 : " + category);
		System.out.println("출판사 : " + publisher);
		
		model.addAttribute("data", "도서분야 : " + category + "<br>" + "출판사 : " + publisher);
		
		return "webpage06";
	}
}
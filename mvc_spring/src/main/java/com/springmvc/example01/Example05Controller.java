package com.springmvc.example01;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.servlet.ModelAndView;

//Model 인터페이스를 이용한 메서드 작성

@Controller
@RequestMapping("/examHome")
public class Example05Controller {
	
	@GetMapping("/exam05")
	public String requestMethod(Model model) {
		model.addAttribute("data", "모델 예제입니다.");
		model.addAttribute("data2", "웹 요청 URL은 /home/exam05 입니다.");
		
		return "webpage05";
	}
	
	@GetMapping("/exam07")
	public ModelAndView requestMvMethod(ModelAndView model) {
		ModelAndView mav = new ModelAndView();
		
		mav.addObject("data1", "ModelAndView 예제입니다.");
		mav.addObject("data2","웹 요청 URL은 /home/exam07 입니다.");
		mav.setViewName("webpage05");
		
		return mav;
	}
	
}

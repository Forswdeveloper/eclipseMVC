package com.springmvc.example01;

import java.io.File;
import java.io.IOException;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.multipart.MultipartFile;

@Controller
@RequestMapping("/exam01")
public class Example01Controller {
	
//	@GetMapping("/exam01")
//	public String requestMethod(Model model) {
//		return "webpage08_01";
//	}
	
	@GetMapping("/form")
	public String requestForm() {
		return "webpage09_01";
	}
	
	@PostMapping("/form")
	public String submitForm(@RequestParam("name") String name,
							 @RequestParam("fileImage") MultipartFile file) {
		String filename = file.getOriginalFilename();
		System.err.println("파일 생성 시작");
		File f = new File("\\Users\\jeongdong-in\\Documents\\uploadFile\\"+name+"_"+filename);
		System.err.println("파일 생성 끝");
		try {
			file.transferTo(f);
		} catch(IOException e) {
			e.printStackTrace();
		}
		
		return "webpage09_submit";
		
	}
	
	@GetMapping("/admin/main")
	public String requestMethod2(Model model) {
		model.addAttribute("data","webpage01/adminPage.jsp");
		return "webpage01/adminPage";
	}
	
	@GetMapping("/manager/main")
	public String requestMethod3(Model model) {
		model.addAttribute("data","webpage01/managerPage.jsp");
		return "webpage01/managerPage";
	}
	
	@GetMapping("/member/main")
	public String requestMethod4(Model model) {
		model.addAttribute("data","webpage01/memberPage.jsp");
		return "webpage01/memberPage";
	}
	
	@GetMapping("/home/main")
	public String requestMethod5(Model model) {
		model.addAttribute("data","webpage01/homePage.jsp");
		return "webpage01/homePage";
	}
}

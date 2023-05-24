package com.springmvc.example01;

import java.io.File;
import java.io.IOException;

import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpSession;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.multipart.MultipartFile;
import org.springframework.web.multipart.MultipartHttpServletRequest;

import com.springmvc.domain.Member;

@Controller
@RequestMapping("/exam01")
public class Example01Controller {
	
//	@GetMapping("/exam01")
//	public String requestMethod(Model model) {
//		return "webpage08_01";
//	}
	
	@GetMapping("/form")
	public String requestForm() {
		return "webpage09_02";
	}
	
	@PostMapping("/form")
	public String submitForm(@ModelAttribute("member") Member member, HttpServletRequest request, HttpSession session,Model model) {
		String name = member.getName();
		String filename = "";
		
		if(!member.getImageFile().isEmpty()) {
			filename = member.getImageFile().getOriginalFilename();
			System.out.println("filename : " + filename);
			System.err.println("파일 생성 시작");
			try {
				member.getImageFile().transferTo(new File("\\Users\\jeongdong-in\\Documents\\uploadFile\\"+name+"_"+filename));
			} catch(IOException e) {
				e.printStackTrace();

				model.addAttribute("error","Read-Only Error");
			}
			System.err.println("파일 생성 끝");
		} else {
			System.err.println("생성할 파일이 존재하지 않습니다.");
			model.addAttribute("error","생성할 파일이 존재하지 않습니다.");
		}
		
		
		return "webpage09_submit";
		
	}
//	public String submitForm(MultipartHttpServletRequest request) {
//		String name = request.getParameter("name");
//		MultipartFile file = request.getFile("fileImage");
//		String filename =file.getOriginalFilename();
//		
//		System.err.println("파일 생성 시작");
//		File f = new File("\\Users\\jeongdong-in\\Documents\\uploadFile\\"+name+"_"+filename);
//		System.err.println("파일 생성 끝");
//		try {
//			file.transferTo(f);
//		} catch(IOException e) {
//			e.printStackTrace();
//		}
//		
//		return "webpage09_submit";
//		
//	}
	
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

package com.springmvc.example01;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.util.MultiValueMap;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.MatrixVariable;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;

@Controller
//@RequestMapping("/exam03")
public class Example03Controller {
	
//	//@RequsetMapping 메서드형
//	@GetMapping("/exam031/{bookId}")
//	public String requestMethod(@PathVariable String bookId, @MatrixVariable String category,Model model){
//		System.out.println("bookId : " + bookId);
//		System.out.println("category : " + category);
//		
//		model.addAttribute("data", "bookId : " + bookId + "<br>" + "category : " + category);
//		
//		return "webpage06";
//	}
//	
//	//MathVariable value, pathVar 변수의 사용  
//	@GetMapping("/exam032/{bookId}/category/{category}")
//	public String requestMatrixMethod(
//			@MatrixVariable(value="publisher",pathVar="bookId") String v1,
//			@MatrixVariable(value="publisher",pathVar="category") String v2, Model model) {
//		
//		System.out.println("출판사 1 : " + v1);
//		System.out.println("출판사 2 : " + v2);
//		model.addAttribute("data", "출판사 1 : " + v1 + "<br>" + "출판사 2 : " + v2);
//		return "webpage06";
//	}
//	//required 변수 사용으로 매트릭스 변수 사용 유무 상관없이 선택사항으로 사용가능,defaultValue 설정으로 기본값 설
//	@GetMapping("/{bookId}")
//	public String requestMatrixMethod(
//			@MatrixVariable(required=false,defaultValue="길벗") String q,Model model) {
//		
//		System.out.println("출판사 : " + q);
//		model.addAttribute("data", "출판사 : " + q);
//		
//		return "webpage06";
//	}
//	
//	//웹 요청 URL의 어느 위치에서든 포함될 수 있는 매트릭스 변수 MultiValueMap<Object,Object>
//	@GetMapping("/{bookId}/category/{category}")
//	public String requsetMatrixMapMethod(
//			@MatrixVariable MultiValueMap<String,String> matrixVars,
//			@MatrixVariable(pathVar="category") MultiValueMap<String,String> matrixVars2,Model model) {
//		
//		
//		System.out.println(matrixVars);
//		System.out.println(matrixVars2);
//		model.addAttribute("data", matrixVars + "<br>" + matrixVars2);
//		return "webpage06";
//	}
	
	@GetMapping("/exam03")
	public String requestMethod2(Model model) {
		return "webpage08_03";
	}
	
	@GetMapping("/admin/tag")
	public String requestMethod3(Model model) {
		return "webpage08_03";
	}
}

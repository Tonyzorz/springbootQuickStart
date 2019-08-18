package com.example.demo.controller;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;

@Controller
public class SecurityController {
	
	@GetMapping("/")
	public String index() {
		System.out.println("this is index");
		return "index";
	}
	
	@GetMapping("/member")
	public void forMember() {
		System.out.println("this is member");
	}
	
	@GetMapping("/manager")
	public void manager() {
		System.out.println("this is manager");
	}
	
	@GetMapping("/admin")
	public void forAdmin() {
		System.out.println("this is member");
	}
}

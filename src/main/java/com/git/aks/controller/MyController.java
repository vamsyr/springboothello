package com.git.aks.controller;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class MyController {

	@GetMapping("/helloAks")
	public String hello() {
		System.out.println("You are in helloAks!");
		return "Hello AKS!";
	}
}

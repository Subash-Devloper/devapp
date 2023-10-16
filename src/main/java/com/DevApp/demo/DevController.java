package com.DevApp.demo;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;
@RestController
public class DevController {
	@GetMapping(value="get")
	public String get() {
		return "This is Developer ss"; 
	}
}

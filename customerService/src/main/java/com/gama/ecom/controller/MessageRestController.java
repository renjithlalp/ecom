package com.gama.ecom.controller;

import org.springframework.beans.factory.annotation.Value;
import org.springframework.cloud.context.config.annotation.RefreshScope;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;


@RefreshScope
@RestController
public class MessageRestController {

	@Value("${message:Hello default}")
	private String message;

	@RequestMapping("/message")
	public String getMessage() {
		return this.message;
	}
	
	@GetMapping("/getMessage")
	public String getMethodMessage() {
		return this.message;
	}
	
	@PostMapping("/postMessage")
	public String getPostMessage() {
		return this.message;
	}
}
	
package com.klef.labexam.controller;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class ClientController {
	
	@GetMapping("/")
	public String main()
	{
		return "OG-154";
	}

}

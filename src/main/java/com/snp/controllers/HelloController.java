package com.snp.controllers;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;

@Controller
public class HelloController {
	@RequestMapping("/{pageName}.html")
	public String hello(@PathVariable String pageName){
		return pageName;
	}
}

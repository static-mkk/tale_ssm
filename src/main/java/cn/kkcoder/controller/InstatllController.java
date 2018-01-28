package cn.kkcoder.controller;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;

@Controller
public class InstatllController {

	@RequestMapping("/install.action")
	public String install(){
		return "templates/install";
	}
	
}

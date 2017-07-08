package com.cedar.tracker.web;

import static org.springframework.web.bind.annotation.RequestMethod.*;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
//import org.springframework.web.bind.annotation.RequestMethod;

@Controller
public class HomeController {
	@RequestMapping(value="/" , method=GET)
	public String home(){
		System.out.println("½øÈë¿ØÖÆÆ÷");
		return "home";
	}
}

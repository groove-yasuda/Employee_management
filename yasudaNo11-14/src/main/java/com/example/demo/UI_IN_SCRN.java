package com.example.demo;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.RequestMapping;
@Controller
public class UI_IN_SCRN {
	
	
	 @RequestMapping("/UI_IN_SCRN") 
	 public String menuScreen() 
	 {
		 return "ui_in_scrn";
	 }
		 
	
}

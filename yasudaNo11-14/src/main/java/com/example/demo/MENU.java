package com.example.demo;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.RequestMapping;
@Controller
public class MENU {
	
	
	 @RequestMapping("/IDOU") 
	 public String menuScreen() 
	 {
		 return "menu";
	 }
		 
	@RequestMapping("/MENU") 
	public String idouScreen(@ModelAttribute InsertSyainForm form)
	{
		String Judge = "0";
		String NO = "";
		Judge = form.getJudge();
		if(Judge.equals("0"))
		{
			NO = "No11";
		}
		else if(Judge.equals("1"))
		{
			NO = "No12_Before";
		}
		else if(Judge.equals("2"))
		{
			NO = "No13";
		}
		else if(Judge.equals("3"))
		{
			NO = "No14";
		}
		return NO;
	}
	
}

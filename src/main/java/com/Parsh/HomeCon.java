package com.Parsh;

import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.servlet.ModelAndView;

@Controller
public class HomeCon {
	
	@GetMapping("")
	public String home()
	{
		//System.out.println("Hi");
		return "home.jsp";
	}
	@RequestMapping("/add")
	public ModelAndView add(HttpServletRequest request,HttpServletResponse response,@RequestParam("op") String s)
	{
		int i=Integer.parseInt(request.getParameter("t1"));
		int j=Integer.parseInt(request.getParameter("t2"));
		
		//System.out.println("hi" + s);
		
		
		int k;
		
		if(s.equals("add"))
		{
			k=i+j;
		}
		else if(s.equals("sub"))
		{
			k=i-j;
		}
		else if(s.equals("div"))
		{
			k=i/j;
		}
		else
		{
			k=i%j;
		}
		ModelAndView mv=new ModelAndView();
		mv.setViewName("dis.jsp");
		
		
		mv.addObject("result",k);
		
		return mv;
	}

}

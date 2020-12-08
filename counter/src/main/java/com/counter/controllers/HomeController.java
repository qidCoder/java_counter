package com.counter.controllers;

import javax.servlet.http.HttpSession;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;

@Controller
public class HomeController {

	@RequestMapping(value = "/", method = RequestMethod.GET)
	public String index(HttpSession session) {
		
		if(session.getAttribute("count") == null) {
			session.setAttribute("count",  0);	
		}
		else {
			Integer count = (Integer) session.getAttribute("count");
			session.setAttribute("count",  count + 1);	
		}	
		
		return "index.jsp";
	}
	
	@RequestMapping(value = "/counter", method = RequestMethod.GET)
	public String counter() {
		return "counter.jsp";
	}
	
	@RequestMapping(value = "/counter2", method = RequestMethod.GET)
	public String counter2(HttpSession session) {
		if(session.getAttribute("count2") == null) {
			session.setAttribute("count2",  0);	
		}
		else {
			Integer count2 = (Integer) session.getAttribute("count2");
			session.setAttribute("count2",  count2 + 2);	
		}	
		return "counter2.jsp";
	}
	
	@RequestMapping(value = "/reset", method = RequestMethod.GET)
	public String reset(HttpSession session) {
		session.setAttribute("count",  0);		
		
		return "redirect:/counter";
	}
	
	@RequestMapping(value = "/reset2", method = RequestMethod.GET)
	public String reset2(HttpSession session) {
		session.setAttribute("count2",  -2);	
		
		return "redirect:/counter2";
	}
}

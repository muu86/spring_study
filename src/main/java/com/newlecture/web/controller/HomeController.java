package com.newlecture.web.controller;

import java.io.IOException;
import java.io.PrintWriter;

import javax.servlet.http.HttpServletResponse;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;

@Controller
@RequestMapping("/")
public class HomeController {

	@RequestMapping("index")
	@ResponseBody
	public String index(HttpServletResponse response) {
		return "<h1>Hello Index 1</h1>";	
//		return "root.index";
	}
	
//	@RequestMapping("index")
//	public void index(HttpServletResponse response) {
//		PrintWriter out;
//		try {
//			out = response.getWriter();
//			out.println("<h1>Hello Index</h1>");
//		} catch (IOException e) {
//			// TODO Auto-generated catch block
//			e.printStackTrace();
//		}
//		
////		return "root.index";
//	}
	
//	@Override
//	public ModelAndView handleRequest(HttpServletRequest request, HttpServletResponse response) throws Exception {
//		
//		System.out.println("index controller");
//		
//		ModelAndView mv = new ModelAndView("root.index");
//		mv.addObject("data", "Hello Spring MVC~");
////		mv.setViewName("/WEB-INF/view/index.jsp");
//		
//		return mv;
//	}
}

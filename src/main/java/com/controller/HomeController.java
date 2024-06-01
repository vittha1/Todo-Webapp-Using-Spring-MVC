package com.controller;

import java.util.Date;
import java.util.List;

import javax.servlet.ServletContext;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;

import com.entities.Todo;

@Controller
public class HomeController 
{
	@Autowired
	ServletContext context;
	
	@RequestMapping("/home")
	public String home(Model m)
	{
		String str="home";
		m.addAttribute("page",str);
		List<Todo> list=(List<Todo>)context.getAttribute("list");
		m.addAttribute("todos", list);
		return "home";
	}
	
	@RequestMapping("/add")
	public String addTodo(Model m)
	{
		Todo t=new Todo();
		m.addAttribute("page", "add");
		m.addAttribute("todo", t);
		return "home";
	}
	
	@RequestMapping(value="/savetodo", method=RequestMethod.POST)
	public String savetodo(@ModelAttribute("todo") Todo t, Model m)
	{
		System.out.println(t);
		
		List<Todo> list=(List<Todo>)context.getAttribute("list");
		list.add(t);
		m.addAttribute("msg","Successfully Added");
		return "home";
		
	}

}

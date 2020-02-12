package com.spring.test.view;

import java.util.Map;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.validation.BindingResult;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;

@Controller
public class SpringIndexImplController {
	/*
	 * @Autowired private UserValidator userValidator;
	 * 
	 * @Autowired private UserService userService;
	 * 
	 * @Autowired private SecurityService securityService;
	 */
	@RequestMapping("/")
	public String home(Map<String, Object> model) {
		model.put("message", " !!");
		return "welcome";
	}

	@RequestMapping(value = "/login", method = RequestMethod.POST)
	public String loginbean(BindingResult bindingResult, Model model) {
		System.out.println("here");
		return "welcome";
	}

	@RequestMapping("/next")
	public String next(Map<String, Object> model) {
		model.put("message", "You are in new page !!");
		return "next";
	}

}
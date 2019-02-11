package com.talbn.HRService.controller;

import javax.servlet.http.HttpSession;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.ui.ModelMap;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;

import com.talbn.HRService.data.EmployeeDaoRepository;

@Controller
public class ViewController {
	
	EmployeeDaoRepository mongoDaoRepository;
	
	  public ViewController(EmployeeDaoRepository mongoDaoRepository) {
	  this.mongoDaoRepository = mongoDaoRepository; }
	
	
	@GetMapping("/home")
	public String viewHome() {
		return "home";
	}
	
	@RequestMapping(value = { "/", "/profile/{employeeId}" }, method = RequestMethod.GET)
	public String viewProfile(@PathVariable("employeeId") String employeeId,Model model) {
		model.addAttribute("employeeId", employeeId);
		mongoDaoRepository.findById(employeeId);
		return "profile";
	}

}

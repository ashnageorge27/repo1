package com.example.demo.controller;

import java.util.ArrayList;
import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;


import com.example.demo.beans.Admin;

import com.example.demo.repository.AdminRepo;


@Controller
public class AdminController {
	@Autowired
	private AdminRepo repo;
	@GetMapping("/index")
	public String goToIndexPage() {
		
		return "index";
	}
	@PostMapping("/logAction")
	public String insertSchool(Admin ad,Model model) {
		
		repo.save(ad);
		List<Admin> lists=new ArrayList<Admin>();
		lists=repo.findAll();
		model.addAttribute("list", lists);
		return "view";
	}
	@GetMapping("/view")
	public String getStudent(Model model) {
		ArrayList<Admin>list =new ArrayList<Admin>();
		list=(ArrayList<Admin>) repo.findAll();
		 model.addAttribute("list",list);  
	        return "view";    
	}
	@GetMapping("/delete")
	public String deleteSchool(int id , Model model) {
		repo.deleteById(id);
		
		List<Admin> lists=new ArrayList<Admin>();
		lists=repo.findAll();
		model.addAttribute("list", lists);
		return "view";
	}
	@GetMapping("/edit")
	public String editSchool(String r,String name,int id,String pass,String gender,String email,Model model) {
		
		model.addAttribute("id", id);
		model.addAttribute("name", name);
		model.addAttribute("pass", pass);
		model.addAttribute("gender", gender);
		model.addAttribute("email", email);

		model.addAttribute("val", r);
		
		List<Admin> lists=new ArrayList<Admin>();
		lists=repo.findAll();
		model.addAttribute("list", lists);
		return "index";
	}

}

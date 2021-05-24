package com.example.demo.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.ModelAttribute;

import com.example.demo.domain.Date;
import com.example.demo.service.DService;

@Controller
public class DController {
	@Autowired
	private DService service;

/*top画面表示*/
	@GetMapping("/top")
	public String top(Model model, @ModelAttribute Date d) {
		model.addAttribute("dates",service.getList());
		return "date/top";
	}
/*新規登録*/
	@GetMapping("date/register")
	public String CreateDateId() {
		return "date/register";
	}

/*変更画面*/
	@GetMapping("date/change")
	public String updateDateId() {
		return "date/change";
	}

}

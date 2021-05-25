package com.example.demo.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.validation.BindingResult;
import org.springframework.validation.annotation.Validated;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;

import com.example.demo.domain.Date;
import com.example.demo.service.DService;

@Controller
public class DController {
	@Autowired
	private DService service;

/*top画面表示*/
	@GetMapping("date/top")
	public String top(Model model, @ModelAttribute Date d) {
		model.addAttribute("dates",service.getList());
		return "date/top";
	}
/*新規登録*/
	@GetMapping("date/register")
	public String createDateId(Model model, @ModelAttribute Date d) {
		model.addAttribute("dates", d);
		return "date/register";
	}
/*新規登録処理*/
	@PostMapping("date/register")
	public String registerId(@Validated @ModelAttribute Date d, BindingResult result) {
		if (result.hasErrors()) {
			return "date/new";
		}
		service.insertOne(d);
		return "redirect:/date/top";
	}
/*変更画面*/
	@GetMapping("date/change/no={no}")
	public String updateDateId(@PathVariable ("no")int no, Model model) {
		model.addAttribute("dates", service.getOne(no));
		return "date/change";
	}
/*変更登録処理*/
	@PostMapping("date/change/no={no}")
	public String update(@ModelAttribute Date d, Model model) {
		service.updateOne(d.getNo(), d.getDateId(), d.getDateName(), d.getYearCalc(), d.getMonthCalc(), d.getDayCalc());
		return "redirect:/date/top";
	}
/*削除*/
	@PostMapping("date/delete/no={no}")
    public String delete(@PathVariable String no, @ModelAttribute Date d) {
        service.deleteOne(d);
        return "redirect:/date/top";
	}
}

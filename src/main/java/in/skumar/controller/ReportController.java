package in.skumar.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;


import in.skumar.entity.CitizenPlan;
import in.skumar.repo.ReportService;
import in.skumar.request.SearchRequest;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.PostMapping;



@Controller
public class ReportController {
	
@Autowired
private  ReportService services;
 
@PostMapping("/searchData")
public String handleSearch(@ModelAttribute("search") SearchRequest request,Model model) {
	
	System.out.println(request);
	
	List<CitizenPlan> plans=services.search(request);
	model.addAttribute("plans", plans);
	
	 init(model);
	   
	return "index";
	
}
	@GetMapping("/")
   public String indexPage(Model model) {
		 
		model.addAttribute("search",new SearchRequest());
		
		 init(model);
		
		return"index";
}
	     private void init(Model model) {
	    //model.addAttribute("search",new SearchRequest());	 
		model.addAttribute("names", services.getPlanNames());
		model.addAttribute("status",services.getPlanStatus());
	}
}
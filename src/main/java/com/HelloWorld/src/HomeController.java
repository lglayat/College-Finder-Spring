package com.HelloWorld.src;

import java.text.DateFormat;
import java.util.ArrayList;
import java.util.Date;
import java.util.HashMap;
import java.util.Locale;
import java.util.Map;


import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.ui.ModelMap;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RequestParam;


@Controller
public class HomeController {
	
	CollegeList collegeList = new CollegeList();
	
	@RequestMapping(value = "/", method = RequestMethod.GET)
	public String home(Model model) {
				
		return "home";
	}
	
	@RequestMapping(value = "/search", method = RequestMethod.GET)
	public String search(Model model) {
		
		return "search";
	}
	
	@RequestMapping(value = "/colleges", method = RequestMethod.GET)
	public String colleges(Model model) {
		
		String[] names = new String[2000];
		names = collegeList.getNames();
		model.addAttribute("colleges", names);
		
		return "colleges";
	}
	
	@RequestMapping(value = "/programs", method = RequestMethod.GET)
	public String programs(Model model) {
		
		model.addAttribute("programs", collegeList.programs);
		
		return "programs";
	}
	
	
	@RequestMapping(value = "/searchResults", method = RequestMethod.POST)
	public String searchResults(@RequestParam HashMap<String,String> allRequestParams, ModelMap model) {
	
		ArrayList<College> results = new ArrayList<College>();
		
		//Make the search and save results		
		results = this.collegeList.advancedSearch(allRequestParams);

		System.out.println("There are " + results.size() + " results for your query");
		model.addAttribute("results", results);
		
		return "searchResults";
	}


	
}

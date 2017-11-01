package com.HelloWorld.src;

import java.text.DateFormat;
import java.util.ArrayList;
import java.util.Date;
import java.util.HashMap;
import java.util.Locale;
import java.util.Map;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.ui.ModelMap;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RequestParam;
/**
 * Handles requests for the application home page.
 */

@Controller
public class HomeController {
	
	private static final Logger logger = LoggerFactory.getLogger(HomeController.class);
	CollegeList collegeList = new CollegeList();
	
	@RequestMapping(value = "/", method = RequestMethod.GET)
	public String home(Locale locale, Model model) {
				
		return "home";
	}
	
	@RequestMapping(value = "/search", method = RequestMethod.GET)
	public String search(Locale locale, Model model) {
		
		return "search";
	}
	
	@RequestMapping(value = "/colleges", method = RequestMethod.GET)
	public String colleges(Locale locale, Model model) {
		
		String[] names = new String[2000];
		names = collegeList.getNames();
		model.addAttribute("colleges", names);
		
		return "colleges";
	}
	
	@RequestMapping(value = "/programs", method = RequestMethod.GET)
	public String programs(Locale locale, Model model) {
		
		model.addAttribute("programs", collegeList.programs);
		
		return "programs";
	}
	
	
	@RequestMapping(value = "/searchResults", method = RequestMethod.POST)
	public String searchResults(@RequestParam HashMap<String,String> allRequestParams, ModelMap model) {
	
		ArrayList<College> results = new ArrayList<College>();
		//Make the search and save results		
		results = this.collegeList.advancedSearch(allRequestParams);
		
		System.out.println(results.get(1));
		model.addAttribute("results", results);
		System.out.println("There are " + results.size() + " results for your query");

//		for ( String key : allRequestParams.keySet()){
//			System.out.println("For the key: "+ key+" The value in the map is: " +allRequestParams.get(key) );
//		}
		
		return "searchResults";
	}


	
}

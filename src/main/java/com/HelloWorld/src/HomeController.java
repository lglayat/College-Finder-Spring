package com.HelloWorld.src;

import java.text.DateFormat;
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
	
	/** 
	 * create a collegehash object file which populates itself from csv file
	 * 
	 * Instantiate college hash object here  so controller can access it
	 * 
	 * 
	 */
	
	
	
	/**
	 * Simply selects the home view to render by returning its name.
	 */
	
	@RequestMapping(value = "/", method = RequestMethod.GET)
	public String home(Locale locale, Model model) {

		
		String jerry = "jerry";
		model.addAttribute("friend", jerry);
		
		return "home";
	}
	
	@RequestMapping(value = "/search", method = RequestMethod.GET)
	public String search(Locale locale, Model model) {
		System.out.println(model.toString());
		
		return "search";
	}
	
	@RequestMapping(value = "/searchResults", method = RequestMethod.POST)
	public String searchResults(@RequestParam HashMap<String,String> allRequestParams, ModelMap model) {
	
		System.out.println("Hello!1");
		for ( String key : allRequestParams.keySet())
		{
			System.out.println("For the key: "+ key+" The value in the map is: " +allRequestParams.get(key) );
		}
		System.out.println("");
		return "searchResults";
	}


	
}

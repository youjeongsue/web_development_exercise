package com.firstSpring.visualize_pilot;

import java.util.List;

import java.util.Locale;
 
import javax.inject.Inject;
 
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;

import com.firstSpring.service.MovieService;
import com.firstSpring.vo.MovieVO;

/**
 * Handles requests for the application home page.
 */
@Controller
public class HomeController {
	
	private static final Logger logger = LoggerFactory.getLogger(HomeController.class);
	
	/**
	 * Simply selects the home view to render by returning its name.
	 */
	@Inject
	private MovieService service;
	
	@RequestMapping(value = "/")
	public String home(Locale locale, Model model) throws Exception{
		logger.info("Home", locale);
		
		//List<MovieVO> movieList = service.selectMovie();
		
		//model.addAttribute("movieList", movieList);
		
		return "home";
	}
	
}

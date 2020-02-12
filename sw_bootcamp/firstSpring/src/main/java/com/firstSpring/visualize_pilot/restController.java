package com.firstSpring.visualize_pilot;

import java.util.List;
import java.util.Locale;

import javax.inject.Inject;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.firstSpring.service.MovieService;
import com.firstSpring.vo.MovieVO;

@RestController
public class restController{
	private static final Logger logger = LoggerFactory.getLogger(restController.class);
	
	@Inject
	private MovieService service;
	
	@RequestMapping(value="/restex")
	public List<MovieVO> home(Locale locale, Model model) throws Exception{
		logger.info("home", locale);
		
		List<MovieVO> movieList = service.selectMovie();
		
		model.addAttribute("movieList", movieList);
		return movieList;
	}
	
	@RequestMapping(value="/mean")
	public List<MovieVO> chart1(Model model) throws Exception{
		logger.info("home");
		
		List<MovieVO> mean_list = service.selectMovie();
		
		model.addAttribute("mean_list", mean_list);
		
		return mean_list;
	}
}
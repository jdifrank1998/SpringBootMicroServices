package com.plantplaces;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;

/**
 * @author Jacob
 *Handle the /start endpoint
 *@return
 */
@Controller
public class PlantPlacesController {
	
	
	@RequestMapping("/start")
	public String Start() 
	{
		return "start";
	}
	/**
	 * 
	 *Handle the / endpoint
	 *@return
	 */
	@RequestMapping("/")
	public String index() 
	{
		return "start";
	}
}

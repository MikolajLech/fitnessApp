package ml.capgemini.controller;

import ml.capgemini.model.Exercise;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.RequestMapping;

@Controller
public class MinuterController {
	
	@RequestMapping(value="/addMinutes")
	public String addMinutes(@ModelAttribute ("exercise") Exercise exercise) {
		
		System.out.println("exercise" + exercise.getMinutes());
		return "addMinutes";
	}
	
//	@RequestMapping(value="/addMoreMinutes")
//	public String addMoreMinutes(@ModelAttribute ("exercise") Exercise exercise) {
//		
//		System.out.println("exercising now" + exercise.getMinutes());
//		return "addMinutes";
//	}

}

package vs.ac.ac_001_1.controller;


import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;

import vs.ac.ac_001_1.domain.AcVO;
import vs.ac.ac_001_1.service.Ac_Service;

@Controller
@RequestMapping("/ac/*")
public class Ac_controllerImpl implements Ac_controller{
	
	@Autowired
	private Ac_Service ac_service;
	
	@Override
	@RequestMapping(value="/ac_002_1" , method = RequestMethod.GET)
	public void ac_List(Model model ,AcVO acvo) throws Exception {
		
		System.out.println("여기는 ControllerImpl");

		//System.out.println("셀렉원" + ac_service.ac_test());
		 model.addAttribute("data", ac_service.ac_List(acvo)); 
		
	}
	/*
		List<AcVO> list = ac_service.Ac_List(acvo);
		
		ModelAndView mav = new ModelAndView();
		mav.setViewName("ac/ac_002_1");
		
		return mav;
	 */	
		  
	
		
	
	
	
}

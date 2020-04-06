package vs.ac.ac_001_1.controller;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;

import lombok.extern.log4j.Log4j;

@Controller
@Log4j
@RequestMapping("/ac/*")
public class Ac_controller {
	
	@RequestMapping(value="/ac_001_1")
	public void regist(){
		log.info("................");
	}
	
	
	
	
	
	
}

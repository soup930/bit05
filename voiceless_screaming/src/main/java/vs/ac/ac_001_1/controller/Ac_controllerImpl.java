package vs.ac.ac_001_1.controller;


import java.util.List;


import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.servlet.ModelAndView;
import lombok.AllArgsConstructor;
import vs.ac.ac_001_1.domain.AcVO;
import vs.ac.ac_001_1.service.Ac_Service;

@Controller
public class Ac_controllerImpl implements Ac_controller{
	@Autowired
	private Ac_Service ac_service;
	@Autowired
	private AcVO acvo;
	 
	@Override
	@RequestMapping(value="/ac_001_1")
	public ModelAndView Ac_List(HttpServletRequest request, HttpServletResponse response) throws Exception {
			
		System.out.println("食奄澗 ControllerImpl");

		List<AcVO> list = ac_service.Ac_List(acvo);
		
		ModelAndView mav = new ModelAndView();
		mav.setViewName("ac/ac_002_1");
		
		return mav;
		
		  
	}

	/*
	@Override
	@GetMapping("ac_002_1")
	public void ac_list(Model model) {
		
		System.out.println("しししししししししししししししし");
		
		model.addAttribute("ac_list", ac_service.ac_list());
		
	}
	*/
		
	
	
	
}

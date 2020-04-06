package vs.ac.ac_001_1.controller;

import java.util.Map;

import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import org.springframework.ui.Model;
import org.springframework.web.servlet.ModelAndView;
import org.springframework.web.servlet.mvc.support.RedirectAttributes;

import vs.ac.ac_001_1.domain.AcVO;

public interface Ac_controller {
 
	public void ac_List(Model model,AcVO acvo) throws Exception;
	

	//public String ac_register(AcVO acvo, RedirectAttributes rttr);
	
	// public void ac_list(Model model);
}

package vs.lc.lc_001_1.controller;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;

import lombok.extern.log4j.Log4j;
import vs.lc.lc_001_1.vo.LC_001_1_VO;

@Controller
@RequestMapping("/lc/*")
@Log4j
public class LC_001_1_Controller {

	@RequestMapping(value = "upload", method = {RequestMethod.GET})
	public String insertCourse(LC_001_1_VO vo, Model model) {
		
		return "redirect:LC_001_1";
	}
}

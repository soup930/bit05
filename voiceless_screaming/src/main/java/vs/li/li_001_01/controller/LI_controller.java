package vs.li.li_001_01.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;

import lombok.extern.log4j.Log4j;
import vs.li.li_001_01.vo.LI_VO;
import vs.li.li_001_1.service.LI_Service;

@Controller
@Log4j
@RequestMapping("/li/*")
public class LI_controller {

	@Autowired
	private LI_Service service;

	@RequestMapping(value = "/li_001_1", method = RequestMethod.GET)
	public void li_review(Model model,LI_VO vo) {

		log.info("----------------------占쎌뜎疫뀐옙 野껊슣�뻻占쎈솇view-------------------");

		vo.setLi_b_type("�옣鍮꾧쾶�떆�뙋");
		
		model.addAttribute("list", service.get_list(vo));

	}
	
	@RequestMapping(value = "/li_002_1", method = RequestMethod.GET)
	public void li_recommendation() {

		log.info("-----------------------�빊遺우퓝 野껊슣�뻻占쎈솇view-------------------");
		
	}
	@RequestMapping(value = "/li_003_1", method = RequestMethod.GET)
	public void li_management() {

		log.info("-----------------------�꽴占썹뵳占� 野껊슣�뻻占쎈솇view-------------------");
		
	}
	@RequestMapping(value = "/li_004_1", method = RequestMethod.GET)
	public void li_boast() {

		log.info("-----------------------占쎌쁽占쎌삂 野껊슣�뻻占쎈솇view-------------------");
		
	}
	
	@RequestMapping(value = "/li_005_1", method = RequestMethod.GET)
	public void li_edit() {

		log.info("-----------------------疫뀐옙 占쎌삂占쎄쉐view-------------------");
		
	}

	@RequestMapping(value = "/li_005_1", method = RequestMethod.POST)
	public String regist(LI_VO vo,Model model) {
		log.info("占쏙옙占쎌삢");
		
		log.info("占쎈�볩옙�뮞占쎈뱜------"+vo.getLi_text());
		log.info("占쏙옙占쎌뿯"+vo.getLi_type());
		log.info("燁삳똾�믤�⑥쥓�봺-----"+vo.getLi_category());
		log.info("野껊슣�뻻占쎈솇占쎌�占쎌굨@@@@@"+vo.getLi_b_type());
		
		service.li_regist(vo);

		log.info("---------占쎌삂占쎄쉐 占쎌끏�뙴占�----------------");
		model.addAttribute("message", "疫뀐옙占쎌삂占쎄쉐占쎌뵠 占쎌끏�뙴�슢由븝옙肉�占쎈뮸占쎈빍占쎈뼄.");
		return "redirect:/li/li001_1";

	}
	
}

package vs.li.li_001_01.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;

import lombok.extern.log4j.Log4j;
import vs.li.li_001_01.vo.LI_VO;
import vs.li.li_001_1.service.LI_Service;
import lombok.AllArgsConstructor;

@Controller
@Log4j
@RequestMapping("/li/*")
public class LI_controller {

	@Autowired
	private LI_Service service;

	@RequestMapping(value = "/li_001_1", method = RequestMethod.GET)
	public void li_review(Model model,LI_VO vo) {

		log.info("----------------------�썑湲� 寃뚯떆�뙋view-------------------");

		vo.setLi_b_type("장비게시판");
		
		model.addAttribute("list", service.get_list(vo));

	}
	
	@RequestMapping(value = "/li_002_1", method = RequestMethod.GET)
	public void li_recommendation() {

		log.info("-----------------------異붿쿇 寃뚯떆�뙋view-------------------");
		
	}
	@RequestMapping(value = "/li_003_1", method = RequestMethod.GET)
	public void li_management() {

		log.info("-----------------------愿�由� 寃뚯떆�뙋view-------------------");
		
	}
	@RequestMapping(value = "/li_004_1", method = RequestMethod.GET)
	public void li_boast() {

		log.info("-----------------------�옄�옉 寃뚯떆�뙋view-------------------");
		
	}
	
	@RequestMapping(value = "/li_005_1", method = RequestMethod.GET)
	public void li_edit() {

		log.info("-----------------------湲� �옉�꽦view-------------------");
		
	}

	@RequestMapping(value = "/li_005_1", method = RequestMethod.POST)
	public String regist(LI_VO vo,Model model) {
		log.info("���옣");
		
		log.info("�뀓�뒪�듃------"+vo.getLi_text());
		log.info("���엯"+vo.getLi_type());
		log.info("移댄뀒怨좊━-----"+vo.getLi_category());
		log.info("寃뚯떆�뙋�쑀�삎@@@@@"+vo.getLi_b_type());
		
		service.li_regist(vo);

		log.info("---------�옉�꽦 �셿猷�----------------");
		model.addAttribute("message", "湲��옉�꽦�씠 �셿猷뚮릺�뿀�뒿�땲�떎.");
		return "redirect:/li/li001_1";
	}
	
}

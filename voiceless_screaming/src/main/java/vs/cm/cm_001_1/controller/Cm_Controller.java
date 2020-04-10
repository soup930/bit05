package vs.cm.cm_001_1.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.ResponseBody;

import vs.cm.cm_001_1.service.Cm_Service;
import vs.cm.cm_001_1.vo.CommentVO;

@Controller
@RequestMapping("/comment")
public class Cm_Controller {

	@Autowired
	Cm_Service cm_service;

	//��� ����Ʈ
	@RequestMapping("/list")
	@ResponseBody
	private List<CommentVO> mCommentServiceList(Model model,@RequestParam String data) throws Exception {
		
		//�Խñ� ��ȣ Ȯ��
		System.out.println(data);
		 
		return cm_service.commentList(data);
		
	}
	
	//��� �ۼ� 
	@RequestMapping(value="/insert", method=RequestMethod.POST)
    @ResponseBody
    private int mCommentServiceInsert(@RequestParam("co_b_index") String com_index, @RequestParam("com_text") String com_text) throws Exception{
        
		System.out.println(com_index);
		System.out.println(com_text);
		
        CommentVO comment = new CommentVO();
        comment.setCo_b_index(com_index);
        comment.setCom_text(com_text);
        
        //comment.setCom_writer("�մ�");
        
        return cm_service.commentInsert(comment);
    }

	//��� ����
	@RequestMapping("/update")
	@ResponseBody
	private int mCommentServiceUpdateProc(@RequestParam("com_index") String com_index, @RequestParam("com_text") String com_text) throws Exception{
        
        CommentVO comment = new CommentVO();
        comment.setCom_index(com_index);
        comment.setCom_text(com_text);
        
        return cm_service.commentUpdateService(comment);
    }
    
	//��ۻ���
	@RequestMapping("/delete/{com_index}")
	@ResponseBody
	private int mCommentServiceDelete(@PathVariable("com_index") String com_index) throws Exception{
        
        return cm_service.commentDelete(com_index); 

	}
	
	
	
	
	
	
	
}

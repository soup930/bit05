package vs.cm.cm_001_1.service;

import java.util.List;

import vs.cm.cm_001_1.vo.CommentVO;

public interface Cm_Service {

	
	//��� ���
	public List<CommentVO> commentList(String data)throws Exception;
	
	//��� �ۼ�
	public int commentInsert(CommentVO comment) throws Exception;
	  
	//��� ����
	public int commentUpdateService(CommentVO comment) throws Exception;
	
	//��� ����
	public int commentDelete(String com_index ) throws Exception;

}

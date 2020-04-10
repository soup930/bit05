package vs.cm.cm_001_1.service;

import java.util.List;

import vs.cm.cm_001_1.vo.CommentVO;

public interface Cm_Service {

	
	//´ñ±Û ¸ñ·Ï
	public List<CommentVO> commentList(String data)throws Exception;
	
	//´ñ±Û ÀÛ¼º
	public int commentInsert(CommentVO comment) throws Exception;
	  
	//´ñ±Û ¼öÁ¤
	public int commentUpdateService(CommentVO comment) throws Exception;
	
	//´ñ±Û »èÁ¦
	public int commentDelete(String com_index ) throws Exception;

}

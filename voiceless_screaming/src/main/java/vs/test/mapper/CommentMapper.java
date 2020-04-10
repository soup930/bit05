package vs.test.mapper;

import java.util.List;

import org.springframework.stereotype.Repository;

import vs.cm.cm_001_1.vo.CommentVO;

@Repository
public interface CommentMapper {

	//´ñ±Û ¸ñ·Ï
 	public List<CommentVO> commentList(String data) throws Exception;
	//´ñ±Û ÀÛ¼º
	public int commentInsert(CommentVO comment) throws Exception;
	//´ñ±Û ¼öÁ¤
	public int commentUpdate(CommentVO comment) throws Exception;
	//´ñ±Û »èÁ¦
	public int commentDelete(String com_index ) throws Exception;

}

package vs.test.mapper;

import java.util.List;

import org.springframework.stereotype.Repository;

import vs.cm.cm_001_1.vo.CommentVO;

@Repository
public interface CommentMapper {

	//��� ���
 	public List<CommentVO> commentList(String data) throws Exception;
	//��� �ۼ�
	public int commentInsert(CommentVO comment) throws Exception;
	//��� ����
	public int commentUpdate(CommentVO comment) throws Exception;
	//��� ����
	public int commentDelete(String com_index ) throws Exception;

}

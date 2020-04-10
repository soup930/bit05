package vs.cm.cm_001_1.service;

import java.util.List;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import vs.cm.cm_001_1.vo.CommentVO;
import vs.test.mapper.CommentMapper;

@Service
public class Cm_ServiceImpl implements Cm_Service{
	
	@Autowired 
	private CommentMapper commentmapper;
	 
	 
	//��� ��� 
	@Override 
	public List<CommentVO> commentList(String data) throws Exception{
	  
		return commentmapper.commentList(data);
	} 
		
	//��� �ۼ�
	@Override
	public int commentInsert(CommentVO comment) throws Exception{
		System.out.println(comment.getCom_writer());
		return commentmapper.commentInsert(comment);
	}
	//��� ����
	@Override
	public int commentUpdateService(CommentVO comment) throws Exception {
		
		return commentmapper.commentUpdate(comment);
	}
	//��� ����
	@Override
	public int commentDelete(String com_index ) throws Exception{
		
		return commentmapper.commentDelete(com_index);
	}
	
}

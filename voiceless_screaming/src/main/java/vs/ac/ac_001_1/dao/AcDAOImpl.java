package vs.ac.ac_001_1.dao;

import java.util.List;

import org.apache.ibatis.session.SqlSession;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Repository;
 
import vs.ac.ac_001_1.domain.AcVO;
 
@Repository
public class AcDAOImpl implements AcDAO{

	@Autowired
	private SqlSession sqlSession;

	
	@Override
	public List<AcVO> Ac_List(AcVO acvo) {
		
		
		try {
			
		System.out.println("食奄澗 DAOImpl");
		
		List<AcVO> list = sqlSession.selectList("ac.ac_list", acvo);
		
		System.out.println(acvo.getCo_b_title());
		
		System.out.println(list.get(0) + "dao : list");
			return list;
		}catch (Exception e) {
			System.out.println("ししししししし" + e);
			return null;
		}
		
		
	}
	
}

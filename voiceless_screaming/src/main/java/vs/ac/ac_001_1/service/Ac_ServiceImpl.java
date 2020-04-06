package vs.ac.ac_001_1.service;

import java.util.List;

import org.apache.ibatis.session.SqlSession;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import vs.ac.ac_001_1.domain.AcVO;

@Service
public class Ac_ServiceImpl implements Ac_Service {

	/*
	 * @Override public List<AcVO> ac_list(){
	 * 
	 * System.out.println("��������������������");
	 * 
	 * return ac_mapper.ac_list(); return null; }
	 */

	@Autowired
	private SqlSession sqlSession;

	@Override
	public List<AcVO> ac_List(AcVO acvo) {
		List<AcVO> list;
		try {
 
			System.out.println(sqlSession.selectList("ac.ac_list", acvo));

			System.out.println("����� ServiceImpl");

			list = sqlSession.selectList("ac.ac_list", acvo);

			System.out.println(list + "����?");

			System.out.println(list.get(0) + "dao : list");
			return list;

		} catch (Exception e) {
			System.out.println("��������������" + e);
			return null;
		}

	}
	/*
	 * @Override public String ac_test() { System.out.println("������������������"); return
	 * sqlSession.selectOne("ac.ac_test");
	 * 
	 * }
	 */

}

package vs.li.li_001_1.service;

import java.util.List;

import org.apache.ibatis.session.SqlSession;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import lombok.extern.log4j.Log4j;
import vs.li.li_001_01.vo.LI_VO;
import vs.li.li_001_1.dto.Page_DTO;

@Log4j
@Service
public class LI_ServiceImpl implements LI_Service {

	@Autowired
	private SqlSession session;

	@Override
	public void li_regist(LI_VO vo) {

		try {
		session.insert("li.insert", vo);
		} catch (Exception e) {
			log.info("서비스 인서트 에러 : "+ e);
		}
	}

	@Override
	public List<LI_VO> get_list(/*LI_VO vo*/Page_DTO dto) {
		List<LI_VO> vvo;
		try {
/*			log.info(vo.getLi_b_type());
			log.info("서비스 쿼리문 확인");
			vvo = session.selectList("li.get_list", vo);
			log.info(vo.getLi_text());
			log.info("서비스 쿼리문 전송 성공");
			*/
			log.info("게시글 목록 확인 : "+session.selectList("li.get_list", dto));
			vvo = session.selectList("li.get_list", dto);
			
			return vvo;
		} catch (Exception e) {
			System.out.println("서비스 에러 : "+e);
			return null;
		}

	}
	
	@Override
	public int get_total(Page_DTO dto) {
		try {
			log.info( "get_total 쿼리문 확인");
			return session.selectOne("li.get_total",dto);
		} catch (Exception e) {
			System.out.println("서비스 에러 : "+e);
			return 0;
		}
	}
}

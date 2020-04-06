package vs.ac.ac_001_1.service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Propagation;
import org.springframework.transaction.annotation.Transactional;

import vs.ac.ac_001_1.dao.AcDAO;
import vs.ac.ac_001_1.domain.AcVO;

@Service
@Transactional(propagation = Propagation.REQUIRED)
public class Ac_ServiceImpl implements Ac_Service{

	/*
	@Override
	public List<AcVO> ac_list(){
		
		System.out.println("しししししししししし");
		
		return ac_mapper.ac_list();
		return null;
	}
	 */
	
	@Autowired
	private AcDAO acdao;

	@Override
	public List<AcVO> Ac_List(AcVO acvo) { 
		System.out.println("食奄澗 ServiceImpl");
		
		List<AcVO> list = acdao.Ac_List(acvo);
		
		System.out.println(list + "serivce : list");
		
		return list;
	}
	 
	 
	
}


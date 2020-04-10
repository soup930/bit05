package vs.sa.sa_003.service;

import java.util.Date;
import java.util.List;
import java.util.Map;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import vs.sa.sa_003.dao.SA_003_DAO;

@Service
public class SA_003_ServiceImpl implements SA_003_SaService {

	@Autowired
	private SA_003_DAO saDao;

	@Override
	public List<Map> CallDb() {
		List<Map> list = saDao.SaList();
		return null;
	}

	@Override
	public List<Map> InsertDb() {

		return null;
	}

	@Override
	public String getTime() {
		String data = saDao.getTime();
		return data;
	}
	
	@Override
	public List<Map<String, String>> SaInsert() {
		
		return null;
	}
	
	@Override
	public List<Map<String, String>> SaProductsList() {
		List<Map<String, String>> data = saDao.SaProductsList();
		return data;
	}

	
}

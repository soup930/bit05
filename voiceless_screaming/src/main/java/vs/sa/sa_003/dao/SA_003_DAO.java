package vs.sa.sa_003.dao;

import java.util.Date;
import java.util.List;
import java.util.Map;
import org.springframework.stereotype.Repository;
import org.springframework.stereotype.Service;

@Service
@Repository
public interface SA_003_DAO {

	List<Map> SaList();

	List<Map<String, String>> SaInsert();

	String getTime();

	List<Map<String, String>> SaProductsList();
	
}

package vs.sa.sa_003.service;

import java.util.Date;
import java.util.List;
import java.util.Map;

public interface SA_003_SaService {
	
	List<Map> CallDb();

	List<Map> InsertDb();

	String getTime();

	List<Map<String, String>> SaInsert();
	List<Map<String, String>> SaProductsList();

}

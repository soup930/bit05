package vs.ac.ac_001_1.domain;

import java.util.Date;

import lombok.Data;

@Data
public class AcVO {
<<<<<<< HEAD
=======
	 
	private String co_b_index;
	private String co_b_text;
	private String co_b_title;
	private String co_b_day;
	
	public String getCo_b_index() {
		return co_b_index;
	}
	public void setCo_b_index(String co_b_index) {
		this.co_b_index = co_b_index;
	}
	public String getCo_b_text() {
		return co_b_text;
	}
	public void setCo_b_text(String co_b_text) {
		this.co_b_text = co_b_text;
	}
	public String getCo_b_title() {
		return co_b_title;
	}
	public void setCo_b_title(String co_b_title) {
		this.co_b_title = co_b_title;
	}

	public String getCo_b_day() {
		return co_b_day;
	}
	public void setCo_b_day(String co_b_day) {
		this.co_b_day = co_b_day;
	}
>>>>>>> f8cfe39e4c6225993d59ddd0b5808dbe332045e5
	
	private int co_b_index;
	private String co_b_title;
	private String co_b_text;
	private int co_b_see;
	private int co_b_good;
	private Date co_b_date;
	private String co_b_day; 
	private String co_b_area;
	private String co_b_period;
	private String co_b_state;
	private int co_b_count;
	private String co_b_type;
	
	
}

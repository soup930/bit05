package vs.ac.ac_001_1.domain;

import java.util.Date;

import org.springframework.stereotype.Component;

import lombok.Data;

@Component
public class AcVO {

	 
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

}

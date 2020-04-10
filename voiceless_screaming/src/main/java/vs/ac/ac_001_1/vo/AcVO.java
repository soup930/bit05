package vs.ac.ac_001_1.vo;

import org.springframework.stereotype.Component;

@Component
public class AcVO {

	private String co_b_index;
	private String co_b_title;
	private String co_b_text;
	private String co_b_day;
	private int co_b_see;
	private int co_b_good;
	private String co_b_date;
	private String co_b_area;
	private String co_b_period;
	private String co_b_type;
	
	public int getCo_b_see() {
		return co_b_see;
	}
	public void setCo_b_see(int co_b_see) {
		this.co_b_see = co_b_see;
	}
	public int getCo_b_good() {
		return co_b_good;
	}
	public void setCo_b_good(int co_b_good) {
		this.co_b_good = co_b_good;
	}
	public String getCo_b_date() {
		return co_b_date;
	}
	public void setCo_b_date(String co_b_date) {
		this.co_b_date = co_b_date;
	}
	public String getCo_b_area() {
		return co_b_area;
	}
	public void setCo_b_area(String co_b_area) {
		this.co_b_area = co_b_area;
	}
	public String getCo_b_period() {
		return co_b_period;
	}
	public void setCo_b_period(String co_b_period) {
		this.co_b_period = co_b_period;
	}
	public String getCo_b_type() {
		return co_b_type;
	}
	public void setCo_b_type(String co_b_type) {
		this.co_b_type = co_b_type;
	}
	
	//번호,제목,일정,참가자 인원, 조회수, 접수 상황, 참가자 리스트
	
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

package vs.li.li_001_01.vo;


import org.springframework.stereotype.Component;


@Component
public class LI_VO {
	private String li_text;
	private String li_category;
	private String m_index = "ineddd";
	private String li_index;
	private String li_b_type;
	private String li_type;
	private String li_thumbnail;
	private String li_picture;
	private String li_date;
	private int li_see,li_good;
	
	public String getLi_text() {
		return li_text;
	}
	public void setLi_text(String li_text) {
		this.li_text = li_text;
	}
	public String getLi_category() {
		return li_category;
	}
	public void setLi_category(String li_category) {
		this.li_category = li_category;
	}
	public String getM_index() {
		return m_index;
	}
	public void setM_index(String m_index) {
		this.m_index = m_index;
	}
	public String getLi_index() {
		return li_index;
	}
	public void setLi_index(String li_index) {
		this.li_index = li_index;
	}
	public String getLi_b_type() {
		return li_b_type;
	}
	public void setLi_b_type(String li_b_type) {
		this.li_b_type = li_b_type;
	}
	public String getLi_type() {
		return li_type;
	}
	public void setLi_type(String li_type) {
		this.li_type = li_type;
	}
	public String getLi_thumbnail() {
		return li_thumbnail;
	}
	public void setLi_thumbnail(String li_thumbnail) {
		this.li_thumbnail = li_thumbnail;
	}
	public String getLi_picture() {
		return li_picture;
	}
	public void setLi_picture(String li_picture) {
		this.li_picture = li_picture;
	}
	public String getLi_date() {
		return li_date;
	}
	public void setLi_date(String li_date) {
		this.li_date = li_date;
	}
	public int getLi_see() {
		return li_see;
	}
	public void setLi_see(int li_see) {
		this.li_see = li_see;
	}
	public int getLi_good() {
		return li_good;
	}
	public void setLi_good(int li_good) {
		this.li_good = li_good;
	}
	
	@Override
	public String toString() {
		return "LI_VO [li_text=" + li_text + ", li_category=" + li_category + ", m_index=" + m_index + ", li_index="
				+ li_index + ", li_b_type=" + li_b_type + ", li_type=" + li_type + ", li_thumbnail=" + li_thumbnail
				+ ", li_picture=" + li_picture + ", li_date=" + li_date + ", li_see=" + li_see + ", li_good=" + li_good
				+ "]";
	}


}

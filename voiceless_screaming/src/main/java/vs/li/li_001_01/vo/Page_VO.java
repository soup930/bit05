package vs.li.li_001_01.vo;

import org.springframework.stereotype.Component;

@Component
public class Page_VO {

	private int page; //
	private int amount; //

	public int getPage() {
		return page;
	}

	public void setPage(int page) {
		this.page = page;
	}

	public int getAmount() {
		return amount;
	}

	public void setAmount(int amount) {
		this.amount = amount;
	}

	public Page_VO() {
		page = 1;
		amount = 10;
	}

}

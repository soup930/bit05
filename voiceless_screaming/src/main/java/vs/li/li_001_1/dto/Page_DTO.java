package vs.li.li_001_1.dto;

import org.springframework.stereotype.Component;

@Component
public class Page_DTO {
	
	private int page; //
	private int amount; //
	private String board;

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

	public String getBoard() {
		return board;
	}

	public void setBoard(String board) {
		this.board = board;
	}

	public Page_DTO() {
		page = 1;
		amount = 10;
		
	}
}

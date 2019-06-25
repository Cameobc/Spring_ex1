package com.iu.board;

import java.sql.Date;

public class BoardVO {
	//vo를 만드는 규칙에 맞게끔.
	//멤버 변수의 접근 지정자는 private
	//setter/getter가 필요
	//default 생성자가 꼭 필요
	
	private int num;
	private String title;
	private String writer;
	private String contents;
	private Date reg_date;
	private int hit;
	
	
	public int getNum() {
		return num;
	}
	public void setNum(int num) {
		this.num = num;
	}
	public String getTitle() {
		return title;
	}
	public void setTitle(String title) {
		this.title = title;
	}
	public String getWriter() {
		return writer;
	}
	public void setWriter(String writer) {
		this.writer = writer;
	}
	public String getContents() {
		return contents;
	}
	public void setContents(String contents) {
		this.contents = contents;
	}
	public Date getReg_date() {
		return reg_date;
	}
	public void setReg_date(Date reg_date) {
		this.reg_date = reg_date;
	}
	public int getHit() {
		return hit;
	}
	public void setHit(int hit) {
		this.hit = hit;
	}
	
	
	
}

package com.tacademy.sam.vo;

import java.util.ArrayList;

public class MemberListResult {
	
	private String status;
	private int count;
	private ArrayList<Member> list;
	
	public ArrayList<Member> getList() {
		return list;
	}
	public void setList(ArrayList<Member> list) {
		this.list = list;
	}
	public String getStatus() {
		return status;
	}
	public void setStatus(String status) {
		this.status = status;
	}
	public int getCount() {
		return count;
	}
	public void setCount(int count) {
		this.count = count;
	}
	@Override
	public String toString() {
		return "MemberListResult [list=" + list + ", status=" + status + ", count=" + count + "]";
	}
	
	
}

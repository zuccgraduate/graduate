package com.hibtest1.entity;

import java.util.List;
import java.io.Serializable;
import java.util.HashSet;
import java.util.Set;

public class Test implements Serializable {
	private Integer tid;
	private String tcontent;
	private String tstate;
    private Set bks=new HashSet();
	public Test(){
		super();
	}
	public Set getBks() {
		return bks;
	}

	public void setBks(Set bks) {
		this.bks = bks;
	}

	public Integer getTid() {
		return tid;
	}

	public void setTid(Integer tid) {
		this.tid = tid;
	}

	public String getTcontent() {
		return tcontent;
	}

	public void setTcontent(String tcontent) {
		this.tcontent = tcontent;
	}

	public String getTstate() {
		return tstate;
	}

	public void setTstate(String tstate) {
		this.tstate = tstate;
	}

}

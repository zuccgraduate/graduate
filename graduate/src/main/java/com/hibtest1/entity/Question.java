package com.hibtest1.entity;

import java.io.Serializable;

public class Question implements Serializable {
	private Integer qid;
	private Integer tid;
	private Integer qmark;
	private String qcontent;
	private String qa;
	private String qb;
	private String qc;
	private String qd;
	private String qanswer;
	private String qexplain;

	// private Test test;

	/*
	 * public Test getTest() { return test; }
	 * 
	 * public void setTest(Test test) { this.test = test; }
	 */

	public Integer getTid() {
		return tid;
	}

	public void setTid(Integer tid) {
		this.tid = tid;
	}

	public Integer getQid() {
		return qid;
	}

	public void setQid(Integer qid) {
		this.qid = qid;
	}

	/*
	 * public Integer getTid() { return tid; } public void setTid(Integer tid) {
	 * this.tid = tid; }
	 */

	public Integer getQmark() {
		return qmark;
	}

	public void setQmark(Integer qmark) {
		this.qmark = qmark;
	}

	public String getQcontent() {
		return qcontent;
	}

	public void setQcontent(String qcontent) {
		this.qcontent = qcontent;
	}

	public String getQa() {
		return qa;
	}

	public void setQa(String qa) {
		this.qa = qa;
	}

	public String getQb() {
		return qb;
	}

	public void setQb(String qb) {
		this.qb = qb;
	}

	public String getQc() {
		return qc;
	}

	public void setQc(String qc) {
		this.qc = qc;
	}

	public String getQd() {
		return qd;
	}

	public void setQd(String qd) {
		this.qd = qd;
	}

	public String getQanswer() {
		return qanswer;
	}

	public void setQanswer(String qanswer) {
		this.qanswer = qanswer;
	}

	public String getQexplain() {
		return qexplain;
	}

	public void setQexplain(String qexplain) {
		this.qexplain = qexplain;
	}

}

package com.ssh2test1.action;

import java.util.Iterator;
import java.util.List;
import java.util.Map;

import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpSession;

import org.apache.struts2.ServletActionContext;
import org.apache.struts2.interceptor.RequestAware;
import org.apache.struts2.interceptor.SessionAware;

import com.hibtest1.entity.Question;
import com.hibtest1.entity.Test;
import com.opensymphony.xwork2.ActionContext;
import com.opensymphony.xwork2.ActionSupport;
import com.ssh2test1.biz.TestBiz;

public class TestManageAction extends ActionSupport implements RequestAware, SessionAware {
	private Test test;

	public Test getTest() {
		return test;
	}

	public void setTest(Test test) {
		this.test = test;
	}

	public void setRequest(Map<String, Object> request) {
		this.request = request;
	}

	public void setSession(Map<String, Object> session) {
		this.session = session;
	}

	public TestBiz getTestBiz() {
		return testBiz;
	}

	public void setTestBiz(TestBiz testBiz) {
		this.testBiz = testBiz;
	}

	public Map<String, Object> getRequest() {
		return request;
	}

	public Map<String, Object> getSession() {
		return session;
	}

	TestBiz testBiz;
	Map<String, Object> request;
	Map<String, Object> session;

	public String stateChoice() {
		Test condition = new Test();
		condition.setTstate(test.getTstate());
		List list = testBiz.testChoice(condition);

 		if (list.size() > 0) {
			 
	// 	HttpServletRequest request = (HttpServletRequest) ActionContext
	//				.getContext().get(ServletActionContext.HTTP_REQUEST);
	//		HttpSession session = request.getSession();
 	//    session.setAttribute("testlist", list);
 	     session.put("testlist", list);
 	    Iterator iter=condition.getBks().iterator();
 	   while(iter.hasNext()){
 		   Question question=(Question)iter.next();
 		   session.put("questionlist", iter);
 	    }
			return "success";
		} else {
			return "fail";
		}

	}
}

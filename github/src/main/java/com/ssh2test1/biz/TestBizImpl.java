package com.ssh2test1.biz;

import java.util.List;

import com.hibtest1.entity.Test;

import com.ssh2test1.dao.TestDAO;


public class TestBizImpl implements TestBiz{
	TestDAO testDAO;
	public void setTestDAO( TestDAO  testDAO){
		this.testDAO=testDAO;
	}
	public List testChoice(Test condition){   //�û�ѡ����ϰ�ȼ�
		return testDAO.search(condition);
	}
	
}

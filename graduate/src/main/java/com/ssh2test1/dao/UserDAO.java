package com.ssh2test1.dao;

import java.util.List;
import com.hibtest1.entity.Users;

public interface UserDAO {
	public List search(Users condition);//查询用户，登录
	public void register(Users user);//注册用户

}

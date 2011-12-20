package com.xiebiao.osgi.business.dao;

import com.xiebiao.osgi.business.domain.User;

public interface UserDao extends IDao {
	public final static String NAME_SPACE = "com.xiebiao.osgi.business.dao.UserDao";
	public User getUser(int userId);
}

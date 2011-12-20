package com.xiebiao.osgi.business.dao.impl;

import com.xiebiao.osgi.business.dao.UserDao;
import com.xiebiao.osgi.business.domain.User;

public class UserDaoImpl extends BaseDao implements UserDao {
	@Override
	public User getUser(int userId) {
		return (User) this.find(String.valueOf(userId));
	}

	@Override
	public String getNameSpace() {
		return NAME_SPACE;
	}

}

package com.xiebiao.osgi.business.dao;

public class LoadJdbcDriver {
	public LoadJdbcDriver() {
		try {
			Class.forName("com.mysql.jdbc.Driver");
		} catch (ClassNotFoundException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
	}
}

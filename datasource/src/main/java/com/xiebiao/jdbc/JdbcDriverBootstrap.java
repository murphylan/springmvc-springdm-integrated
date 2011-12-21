package com.xiebiao.jdbc;

public class JdbcDriverBootstrap {
	public static Class forName(String className) throws ClassNotFoundException {
		return Class.forName(className);
	}
}

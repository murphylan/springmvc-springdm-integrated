package com.xiebiao.osgi.business.dao;

import java.io.IOException;
import java.io.Reader;

import junit.framework.Assert;
import junit.framework.TestCase;

import org.apache.ibatis.io.Resources;
import org.apache.ibatis.session.SqlSession;
import org.apache.ibatis.session.SqlSessionFactory;
import org.apache.ibatis.session.SqlSessionFactoryBuilder;
import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

import com.xiebiao.osgi.business.domain.User;

public class LoadSpringConfigTest extends TestCase {
	private ApplicationContext cx;

	public void setUp() throws Exception {
		//cx = new ClassPathXmlApplicationContext(
			//	"META-INF/spring/context-osgi.xml");
	}

	public void test_right() {
	}

	public void a_test_retrieve_bean_from_xml() {
		UserDao ud = (UserDao) cx.getBean("userDaoImpl");
		Assert.assertNotNull(ud);
		User user = (User) ud.find("1");
		System.out.println(user.getAge());
		System.out.println(user.getUserName());
		user.setUserName("ali");
		ud.update(user);
		user = (User) ud.find("1");
		System.out.println(user.getAge());
		System.out.println(user.getUserName());
	}

	public void a_test_mybatis_config() {
		String resource = "mybatis/ibatis-sql-map.xml";
		Reader reader;
		try {
			reader = Resources.getResourceAsReader(resource);
			SqlSessionFactory sessionFactory = new SqlSessionFactoryBuilder()
					.build(reader);
			SqlSession session = sessionFactory.openSession();
		} catch (IOException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}

	}
}

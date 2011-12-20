package com.xiebiao.osgi.springmvc.web.controller;

import org.springframework.osgi.extensions.annotation.ServiceReference;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.servlet.ModelAndView;

import com.xiebiao.osgi.business.dao.UserDao;
import com.xiebiao.osgi.business.service.ComputeService;

/**
 * 
 * @author xiaog
 * 
 */
@Controller
public class UserController {
	// @Autowired
	// BundleContext bundleContext;

	private ComputeService computeService;
	private UserDao	 userDao;
	@ServiceReference
	public void setComputeService(ComputeService computeService) {
		// 通过springdm注入service
		this.computeService = computeService;
	}
	@ServiceReference
	public void setUserDao(UserDao userDao) {
		// 通过springdm注入dao
		// 同样可以写到service里面
		this.userDao = userDao;
	}
	@RequestMapping(value = "/user/{userId}", method = RequestMethod.GET)
	public ModelAndView compute(@PathVariable("userId") int userId) {
		ModelAndView mv = new ModelAndView("user");
		mv.addObject("user", userDao.getUser(userId));
		return mv;
	}

}

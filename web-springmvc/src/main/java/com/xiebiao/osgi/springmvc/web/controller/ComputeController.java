package com.xiebiao.osgi.springmvc.web.controller;

import org.springframework.osgi.extensions.annotation.ServiceReference;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.servlet.ModelAndView;

import com.xiebiao.osgi.business.service.ComputeService;
import com.xiebiao.osgi.springmvc.web.pojo.ComputePojo;

/**
 * 
 * @author xiaog
 * 
 */
@Controller
public class ComputeController {
	// @Autowired
	// BundleContext bundleContext;

	private ComputeService computeService;

	@ServiceReference
	public void setComputeService(ComputeService computeService) {
		// 通过springdm注入service
		this.computeService = computeService;
	}

	@RequestMapping(value = "/compute", method = RequestMethod.POST)
	public ModelAndView compute(@ModelAttribute("pojo") ComputePojo pojo) {
		ModelAndView mv = new ModelAndView("compute");
		mv.addObject("result", computeService.compute(pojo.getA(), pojo.getB()));
		return mv;
	}

}

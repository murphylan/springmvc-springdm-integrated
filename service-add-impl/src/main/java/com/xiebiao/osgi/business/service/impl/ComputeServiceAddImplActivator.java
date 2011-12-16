package com.xiebiao.osgi.business.service.impl;

import java.util.Dictionary;
import java.util.Hashtable;

import org.osgi.framework.BundleActivator;
import org.osgi.framework.BundleContext;

import com.xiebiao.osgi.business.service.ComputeService;

public class ComputeServiceAddImplActivator implements BundleActivator {
	private static BundleContext context;

	public void start(BundleContext context) throws Exception {
		ComputeServiceAddImplActivator.context = context;
		ComputeService service = new Add();
		// 设置参数
		Dictionary<String, String> properties = new Hashtable<String, String>();
		context.registerService(ComputeService.class.getName(), service,
				properties);
	}

	public void stop(BundleContext context) throws Exception {
		ComputeServiceAddImplActivator.context = null;
	}

}

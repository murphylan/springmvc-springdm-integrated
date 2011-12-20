package com.xiebiao.osgi.business.service.impl;

import com.xiebiao.osgi.business.service.ComputeService;

public class Subtract implements ComputeService {
	public int compute(int a, int b) {
		return (a - b);
	}

	@Override
	public void store(Object obj) {
		// TODO Auto-generated method stub
		
	}
}

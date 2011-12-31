package com.xiebiao.osgi.business.service.impl;

import com.xiebiao.osgi.business.service.ComputeService;
/**
 * 实现两个整型数值的相减实现.
 * @author xiaog
 *
 */
public class Subtract implements ComputeService {
	public int compute(int a, int b) {
		return (a - b);
	}
}

package com.qiuzd.ssm.test;

import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import com.qiuzd.ssm.bean.Staff;
import com.qiuzd.ssm.controller.StaffController;

public class Test {
	
	@org.junit.Test
	public void test1() {
		StaffController contorller = new StaffController();
		HttpServletResponse res = null;
		HttpServletRequest req = null;
		Staff staff = null;
		System.out.println(staff);
	}
}

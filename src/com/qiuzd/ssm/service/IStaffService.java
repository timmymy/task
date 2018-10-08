package com.qiuzd.ssm.service;

import java.util.List;

import com.qiuzd.ssm.bean.Staff;

public interface IStaffService {
	
	public Staff findStaffBystaffId(int staffId);
	
	public List<Staff> findByJobIdAndPwd(Staff staff);
	
}

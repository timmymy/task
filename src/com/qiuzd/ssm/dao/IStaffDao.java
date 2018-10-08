package com.qiuzd.ssm.dao;

import java.util.List;

import com.qiuzd.ssm.bean.Staff;

public interface IStaffDao {
	
	public Staff findById(int id);
	
	public List<Staff> findByJobIdAndPwd(Staff staff);
}

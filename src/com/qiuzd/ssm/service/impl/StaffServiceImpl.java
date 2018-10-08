package com.qiuzd.ssm.service.impl;

import java.util.List;

import javax.annotation.Resource;

import org.springframework.stereotype.Service;

import com.qiuzd.ssm.bean.Staff;
import com.qiuzd.ssm.dao.IStaffDao;
import com.qiuzd.ssm.service.IStaffService;

@Service("staffService")
public class StaffServiceImpl implements IStaffService {
	
	@Resource
	private IStaffDao staffDao;

	@Override
	public Staff findStaffBystaffId(int staffId) {
		return staffDao.findById(staffId);
	}

	@Override
	public List<Staff> findByJobIdAndPwd(Staff staff) {
		return (List<Staff>) staffDao.findByJobIdAndPwd(staff);
	}
	
}

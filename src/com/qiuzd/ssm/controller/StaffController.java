package com.qiuzd.ssm.controller;


import java.util.List;

import javax.annotation.Resource;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.util.StringUtils;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.ResponseBody;
import org.springframework.web.servlet.ModelAndView;

import com.qiuzd.ssm.bean.Staff;
import com.qiuzd.ssm.service.IStaffService;

@Controller
@RequestMapping("/staff")
public class StaffController {
	
	@Resource
	private IStaffService staffService;
	
	@ResponseBody
	@RequestMapping("/login" )
	public ModelAndView findStaffInfo(@RequestParam(value = "jobId") String staffJobId,@RequestParam(value = "staffPwd") String staffPwd) {
		ModelAndView mv = null;
		if (StringUtils.isEmpty(staffPwd)&StringUtils.isEmpty(staffJobId)) {
			mv = new ModelAndView("index");
			mv.addObject("msg","act or pwd is null");
		}
		Staff staff = new Staff(staffPwd,staffJobId);
		List<Staff> res = staffService.findByJobIdAndPwd(staff);
		if (res!=null) {
			mv = new ModelAndView("welcome");
			for(int i=0;i<res.size();i++) {
				mv.addObject("staff",res.get(i).getStaffName());
			}
		}else {
			mv.addObject("msg","no such staff");
		}
		return mv;
	}
	
}
	
	

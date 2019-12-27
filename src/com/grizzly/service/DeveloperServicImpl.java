package com.grizzly.service;

import java.util.Date;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

import javax.annotation.Resource;
import javax.servlet.http.HttpSession;

import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;
import org.springframework.ui.Model;

import com.grizzly.dao.DeveloperMapper;
import com.grizzly.model.AppInform;;

@Service("Developer")
@Transactional
public class DeveloperServicImpl implements DeveloperService{
	@Resource
	public DeveloperMapper developerMapper;

	@Override
	public String getAppInforms(Model model) {
		// TODO Auto-generated method stub
		List<AppInform> appinforms= developerMapper.allAppInform();
		System.out.println("共有"+ appinforms.size()+"条产品信息");
		model.addAttribute("appinforms", appinforms);
		return "main";
	}
}

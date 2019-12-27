package com.grizzly.controller;

import java.util.HashMap;
import java.util.Map;

import javax.servlet.http.HttpSession;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;

import com.grizzly.model.AppInform;
import com.grizzly.service.DeveloperService;

@Controller
public class DeveloperController {
	@Autowired
	private DeveloperService developerService;
	
	@RequestMapping("/getappinforms")
	public String getAppInforms(Model model){
		Map<String, Object> map = new HashMap<String, Object>();
		return  developerService.getAppInforms(model);
	}
}

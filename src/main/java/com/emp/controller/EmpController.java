package com.emp.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;

import com.emp.service.EmpService;

@Controller
@RequestMapping("/emp")
public class EmpController {
	
	 @Autowired
	    private EmpService empService;

}

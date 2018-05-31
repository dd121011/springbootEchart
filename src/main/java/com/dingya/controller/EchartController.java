package com.dingya.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.dingya.bean.EchartData;
import com.dingya.service.EcharService;
import com.dingya.util.EchartUtil;

@RestController
@RequestMapping(value = "/echart")
public class EchartController {
	@Autowired
	EcharService echarService;

	@RequestMapping(value = "/line")
	public EchartData line() {
		return echarService.makeData(EchartUtil.TYPE_LINE, 2);
	}

	@RequestMapping(value = "/bar")
	public EchartData bar() {
		return echarService.makeData(EchartUtil.TYPE_BAR, 2);
	}
	
	@RequestMapping(value = "/lineAndBar")
	public EchartData lineAndBar() {
		return echarService.makeData(EchartUtil.TYPE_LINE, 1, EchartUtil.TYPE_BAR, 1);
	}
	
	@RequestMapping(value = "/pie")
	public EchartData pie() {
		return echarService.makePieData(5);
	}
}

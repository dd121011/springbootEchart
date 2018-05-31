package com.dingya.service.impl;

import java.util.ArrayList;
import java.util.LinkedHashMap;
import java.util.List;

import org.springframework.stereotype.Service;

import com.dingya.bean.BaiduEntry;
import com.dingya.bean.BaiduSeries;
import com.dingya.bean.EchartData;
import com.dingya.service.EcharService;
import com.dingya.util.EchartUtil;

@Service
public class EcharServiceImpl implements EcharService {
	String title = "标题：大豆销量";
	String subTitle = "副标题：2017年度";
	String name = "名称：大豆销量";

	public EchartData makeData(String type, int number) {
		List<BaiduEntry> entry = null;
		List<String> xaxis = EchartUtil.getXAxis();
		List<BaiduSeries> series = new ArrayList<BaiduSeries>();
		List<String> legend = new ArrayList<String>();
		for (int i = 1; i < number + 1; i++) {
			series.add(new BaiduSeries(type + i, type, EchartUtil.createData()));
			legend.add(type + i);
		}
		return new EchartData(title, subTitle, name, legend, xaxis, series, entry);
	}
	
	public EchartData makeData(String type1, int number1, String type2, int number2) {
		EchartData data = makeData(type1, number1);
		for (int i = 1; i < number2 + 1; i++) {
			data.getSeries().add(new BaiduSeries(type2 + i, type2, EchartUtil.createData()));
		}
		return data;
	}

	public EchartData makePieData(int number) {
		List<String> xaxis = null;
		List<BaiduSeries> series = null;
		// 设置参数entry
		LinkedHashMap<String, Float> map = EchartUtil.createMapData(number);
		List<BaiduEntry> entry = EchartUtil.map2entry(map);
		List<String> legend = new ArrayList<String>();
		for(int i = 0; i < entry.size(); i ++) {
			legend.add(entry.get(i).name);
		}
		return new EchartData(title, subTitle, name, legend, xaxis, series, entry);
	}
}

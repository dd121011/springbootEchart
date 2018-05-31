package com.dingya.service;

import com.dingya.bean.EchartData;

/**
 *
 * @author dingya
 *
 */
public interface EcharService {
	
	/**
	 * 生成echart格式数据
	 * @param type
	 * @param number
	 * @return
	 */
	public EchartData makeData(String type, int number);
	
	/**
	 * 生成echart格式数据
	 * @param type1
	 * @param number1
	 * @param type2
	 * @param number2
	 * @return
	 */
	public EchartData makeData(String type1, int number1, String type2, int number2);
	
	/**
	 * 生成饼图数据
	 * @param number
	 * @return
	 */
	public EchartData makePieData(int number);
}

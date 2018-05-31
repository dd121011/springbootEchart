package com.dingya.bean;

import java.util.List;

public class EchartData {
	/**
	 * 成员变量
	 */
	private String title;
	private String subTitle;
	private String name;
	private List<String> legend;
	private List<String> xaxis;
	private List<BaiduSeries> series;
	private List<BaiduEntry> entry;

	/**
	 * 构造方法
	 * @param title
	 * @param subTitle
	 * @param name
	 * @param legend
	 * @param xaxis
	 * @param series
	 * @param entry
	 */
	public EchartData(String title, String subTitle, String name, List<String> legend, List<String> xaxis, List<BaiduSeries> series,
			List<BaiduEntry> entry) {
		super();
		// 赋值
		this.title = title;
		this.subTitle = subTitle;
		this.name = name;
		this.legend = legend;
		this.xaxis = xaxis;
		this.series = series;
		this.entry = entry;
	}

	/**
	 * setter && getter
	 * @return
	 */
	public String getTitle() {
		return title;
	}

	public void setTitle(String title) {
		this.title = title;
	}

	public String getSubTitle() {
		return subTitle;
	}

	public void setSubTitle(String subTitle) {
		this.subTitle = subTitle;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public List<String> getLegend() {
		return legend;
	}

	public void setLegend(List<String> legend) {
		this.legend = legend;
	}

	public List<String> getXaxis() {
		return xaxis;
	}

	public void setXaxis(List<String> xaxis) {
		this.xaxis = xaxis;
	}

	public List<BaiduSeries> getSeries() {
		return series;
	}

	public void setSeries(List<BaiduSeries> series) {
		this.series = series;
	}

	public List<BaiduEntry> getEntry() {
		return entry;
	}

	public void setEntry(List<BaiduEntry> entry) {
		this.entry = entry;
	}
}

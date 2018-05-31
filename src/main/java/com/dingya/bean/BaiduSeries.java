package com.dingya.bean;

import java.io.Serializable;
import java.util.List;

public class BaiduSeries implements Serializable {
	// 版本序列号
	private static final long serialVersionUID = 1L;

	// 成员变量
	String name;
	String type = "line";
	boolean smooth = true;
	List<?> data;
	
	// 构造方法
	public BaiduSeries() {
		super();
	}
	
	public BaiduSeries(String name, String type, List<?> data) {
		super();
		this.name = name;
		this.type = type;
		this.data = data;
	}

	// setter && getter
	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public String getType() {
		return type;
	}

	public void setType(String type) {
		this.type = type;
	}

	public boolean isSmooth() {
		return smooth;
	}

	public void setSmooth(boolean smooth) {
		this.smooth = smooth;
	}

	public List<?> getData() {
		return data;
	}

	public void setData(List<?> data) {
		this.data = data;
	}
}

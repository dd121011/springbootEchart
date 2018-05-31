package com.dingya.util;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.LinkedHashMap;
import java.util.List;
import java.util.Map;
import java.util.Map.Entry;
import java.util.Random;

import com.dingya.bean.BaiduEntry;

public class EchartUtil {
	// 静态变量
	private static final int MONTH_COUNT = 12;
	public static final String TYPE_LINE = "line";
	public static final String TYPE_BAR = "bar";

	// 重载类
	/*
	 * 构建饼图的数据
	 */
	public static LinkedHashMap<String, Float> createMapData() {
		return createMapData(MONTH_COUNT);
	}

	/*
	 * 返回1个list,长度12,成员是随机Int
	 */
	public static List<Integer> createData() {
		return createData(MONTH_COUNT);
	}

	/*
	 * 返回1个list,长度count,成员是‘1月’到‘12月’
	 */
	public static List<String> getXAxis() {
		return getXAxis(MONTH_COUNT);
	}

	// 工具类
	/*
	 * LinkedHashMap<String, Float>转换为 List<BaiduEntry>
	 */
	public static List<BaiduEntry> map2entry(LinkedHashMap<String, Float> data) {
		List<BaiduEntry> list = new ArrayList<BaiduEntry>();
		Iterator<Entry<String, Float>> iterator = data.entrySet().iterator();
		while (iterator.hasNext()) {
			Map.Entry<String, Float> entry = (Map.Entry<String, Float>) iterator.next();
			BaiduEntry e = new BaiduEntry();
			e.name = entry.getKey();
			e.value = entry.getValue();
			list.add(e);
		}
		return list;
	}
	
	/*
	 * 构建饼图的数据
	 */
	public static LinkedHashMap<String, Float> createMapData(int count) {
		LinkedHashMap<String, Float> result = new LinkedHashMap<String, Float>(count);
		for (int j = 1; j <= count; j++) {
			result.put(j + "月", new Random().nextFloat());
		}
		return result;
	}

	/*
	 * 返回1个list,长度count,成员是随机Int
	 */
	public static List<Integer> createData(int count) {
		List<Integer> data = new ArrayList<Integer>();
		for (int j = 0; j < count; j++) {
			data.add(new Random().nextInt());
		}
		return data;
	}

	/*
	 * 返回1个list,长度count,成员是‘1月’到‘count月’
	 */
	public static List<String> getXAxis(int count) {
		List<String> list = new ArrayList<String>();
		for (int j = 1; j <= count; j++) {
			list.add(j + "月");
		}
		return list;
	}
}

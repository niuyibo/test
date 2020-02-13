/*
 * Copyright (C) 2018 royal Inc., All Rights Reserved.
 */
package com.testes.utils;

import java.util.HashMap;
import java.util.Map;

import com.alibaba.fastjson.JSON;

/**
 * 
 * @Description: JSON序列化与反序列化类
 * @Author: yeyuelong
 * @Date: 创建时间    2017年7月17日 下午4:04:41 
 *
 */
public class JSONUtil {
	
	public static <T> T toObject(String st, Class<T> t) {
		if (!st.equals("")) {
			return JSON.parseObject(st, t);
		}
		return null;
	}

	/**
	 * 
	 * @Description: 将对象转化为json
	 * @author yeyuelong
	 * @version 2017年3月23日 上午11:16:48 
	 * @param object
	 * @return
	 *
	 */
	public static String toJson(Object object) {
		String json = "";
		try {
			json = JSON.toJSON(object).toString();
		} catch (Exception e) {
			e.printStackTrace();
			return "";
		}
		return json;
	}

	/**
	 * 
	 * @Description: 将对象转化为json对象
	 * @author yeyuelong
	 * @version 2017年3月23日 上午11:15:51 
	 * @param object
	 * @return
	 *
	 */
	public static JSON toJsonBean(Object object) {
		try {
			if (object == null) {
				return null;
			}
			// 对象转换
			return (JSON) JSON.toJSON(object);
		} catch (ClassCastException e) {
			// 类型失败后,转换为string类型
			return JSON.parseObject("" + object.toString());
		} catch (Exception e) {
			e.printStackTrace();
			Map<String,Object> map = new HashMap<String,Object>();
			map.put("msg", "error");
			return (JSON) JSON.toJSON(map);
		}
	}
	
}

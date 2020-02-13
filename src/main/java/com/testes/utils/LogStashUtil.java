package com.testes.utils;

import com.alibaba.fastjson.JSON;

//logstash日志信息工具类
public class LogStashUtil {
	/**
	 * 成功数据 返回json格式日志数据
	 */
	public static String success(Object obj) {
		return success("操作成功", obj);
	}

	/**
	 * 成功信息 返回json格式日志数据
	 */
	public static String success(String msg, Object obj) {
		return info(true, msg, obj);
	}

	/**
	 * 失败信息 返回json格式日志数据
	 */
	public static String error(String msg) {
		return error(msg, null);
	}

	/**
	 * 失败信息 返回json格式日志数据
	 */
	public static String error(String msg, Object obj) {
		return info(false, msg, obj);
	}

	/**
	 * 返回json格式日志数据
	 */
	public static String info(Boolean success, String msg, Object obj) {
		LogStashInfo info = new LogStashInfo();
		info.setSuccess(success);
		info.setMessage(msg);
		info.setObj(obj);
		return JSON.toJSONString(info);
	}
}

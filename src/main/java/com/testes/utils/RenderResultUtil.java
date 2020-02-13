/*
 * Copyright (C) 2018 royal Inc., All Rights Reserved.
 */
package com.testes.utils;

import com.alibaba.fastjson.JSON;
import com.alibaba.fastjson.JSONObject;

/**
 * @Description: 数据渲染工具类
 * @Author: nyb
 * @Date: 创建时间 2018年7月25日 上午11:20:34
 */
public class RenderResultUtil {

	/**
	 * @Description: 渲染失败数据
	 * @Author: nyb
	 * @Date: 2018年7月25日 上午11:21:19
	 * @return JsonResult
	 */
	public static JsonResult renderError() {
		JsonResult result = new JsonResult();
		result.setSuccess(false);
		result.setStatus("500");
		return result;
	}

	/**
	 * @Description: 渲染失败数据（带消息）
	 * @Author: nyb
	 * @Date: 2018年7月25日 上午11:21:53
	 * @param msg 需要返回的消息
	 * @return JSONUtil.toJsonBean(result)
	 */
	public static JSON renderError(String msg) {
		JsonResult result = renderError();
		result.setMsg(msg);
		return toJSONObject(result);
	}
	
	/**
     * @Description: 渲染失败数据（带数据）
     * @Author: nyb
     * @Date: 2018年7月25日 上午11:23:26
     * @param obj 需要返回的对象
     * @return JSONUtil.toJsonBean(result)
     */
    public static JSON renderError(JSONObject jsonObj) {
        JsonResult result = renderError();
        result.setObj(jsonObj);
        return toJSONObject(result);
    }

	/**
	 * @Description: 渲染成功数据
	 * @Author: nyb
	 * @Date: 2018年7月25日 上午11:22:36
	 * @return JsonResult
	 */
	public static JsonResult renderSuccess() {
		JsonResult result = new JsonResult();
		result.setSuccess(true);
		result.setStatus("200");
		return result;
	}

	/**
	 * @Description: 渲染成功数据（带信息）
	 * @Author: nyb
	 * @Date: 2018年7月25日 上午11:23:01
	 * @param msg 需要返回的信息
	 * @return JSONUtil.toJsonBean(result)
	 */
	public static JSON renderSuccess(String msg) {
		JsonResult result = renderSuccess();
		result.setMsg(msg);
		return toJSONObject(result);
	}

	/**
	 * @Description: 渲染成功数据（带数据）
	 * @Author: nyb
	 * @Date: 2018年7月25日 上午11:23:26
	 * @param obj 需要返回的对象
	 * @return JSONUtil.toJsonBean(result)
	 */
	public static JSON renderSuccess(Object obj) {
		JsonResult result = renderSuccess();
		result.setObj(obj);
		return toJSONObject(result);
	}

	/**
	 * @Description: 渲染成功数据（带数据/带信息）
	 * @Author: chenkai
	 * @Date: 2018年7月6日09:30:32
	 * @param obj 需要返回的对象
	 * @param msg 需要返回的信息
	 * @return JSONUtil.toJsonBean(result)
	 */
	public static JSONObject renderSuccess(String msg, Object obj) {
		JsonResult result = renderSuccess();
		result.setObj(obj);
		result.setMsg(msg);
		return toJSONObject(result);
	}

	private static JSONObject toJSONObject(JsonResult result) {
		try {
			if (result == null) {
				return null;
			}
			// 对象转换
			return JSON.parseObject(JSON.toJSONString(result));
		} catch (Exception e) {
			e.printStackTrace();
			JSONObject json = new JSONObject();
			json.put("msg", "error");
			return json;
		}
	}
}

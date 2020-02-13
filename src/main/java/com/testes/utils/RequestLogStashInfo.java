package com.testes.utils;

import com.alibaba.fastjson.JSON;

/**
 * 待写入logstash的日志信息
 * @author niuyibo
 */
public class RequestLogStashInfo {
	private Integer logType = 3;// 1接口请求日志，2服务端默认业务日志，3调用第3方接口日志，4调用第3方接口返回结果日志
	private String url;// 请求url
	private String method;// get、post
	private JSON params;// 参数
	private String code; // 请求结果类型(必填)
	private String message; // 结果说明
	private JSON result; // 返回结果数据


	public String getMessage() {
		return message;
	}

	public void setMessage(String message) {
		this.message = message;
	}


	public String getUrl() {
		return url;
	}

	public void setUrl(String url) {
		this.url = url;
	}

	public String getMethod() {
		return method;
	}

	public void setMethod(String method) {
		this.method = method;
	}

	public Integer getLogType() {
		return logType;
	}

	public void setLogType(Integer logType) {
		this.logType = logType;
	}


	public String getCode() {
		return code;
	}

	public void setCode(String code) {
		this.code = code;
	}

	public JSON getParams() {
		return params;
	}

	public void setParams(JSON params) {
		this.params = params;
	}

	public JSON getResult() {
		return result;
	}

	public void setResult(JSON result) {
		this.result = result;
	}

}

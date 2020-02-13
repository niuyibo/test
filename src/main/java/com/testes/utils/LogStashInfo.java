package com.testes.utils;

/**
 * 待写入logstash的日志信息
 * @author niuyibo
 */
public class LogStashInfo {
	private Integer logType = 2;// 1接口请求日志，2服务端默认业务日志，3调用第3方接口日志，4调用第3方接口返回结果日志
	private Boolean success = true; // 业务结果(必填)
	private String message; // 业务信息(必填)
	private Object obj; // 业务数据

	public Integer getLogType() {
		return logType;
	}

	public void setLogType(Integer logType) {
		this.logType = logType;
	}

	public Boolean getSuccess() {
		return success;
	}

	public void setSuccess(Boolean success) {
		this.success = success;
	}

	public String getMessage() {
		return message;
	}

	public void setMessage(String message) {
		this.message = message;
	}

	public Object getObj() {
		return obj;
	}

	public void setObj(Object obj) {
		this.obj = obj;
	}

}

package com.czj.common;

import java.io.Serializable;

/**
 * 
 *
 *
 */
public class Result implements Serializable {
	// 错误代码，由系统统一制定规划
	/*
	 * 默认设定 0：默认失败 1：默认成功 110：默认未登录 120：默认权限不足 404：默认无效请求
	 */
	private int code;
	// 服务器消息 ，标准代码，消息为空即可
	private String msg;

	private Object data;

	private long totalCount;

	private int pageNum;

	private int pageSize;

	public int getCode() {
		return code;
	}

	public void setCode(int code) {
		this.code = code;
	}

	public String getMsg() {
		return msg;
	}

	public void setMsg(String msg) {
		this.msg = msg;
	}

	// 直接返回成功操作
	public Result() {
		this.code = ErrorCode.Ok.getValue();
		this.msg = "";
	}

	public static final String SERVER_EXCEPTION = "服务器异常，请稍后再试! ";

	// 返回错误代码
	public Result(ErrorCode code) {
		this.code = code.getValue();
		this.msg = "";
	}

	// 返回完整参数
	public Result(ErrorCode code, String msg) {
		this.code = code.getValue();
		this.msg = msg;
	}

	public Result(Object t) {
		this.code = ErrorCode.Ok.getValue();
		this.msg = "";
		this.data = t;
	}

	public Result(Object t, long totalCount, int pageNum) {
		this.code = ErrorCode.Ok.getValue();
		this.msg = "";
		this.data = t;
		this.pageNum = pageNum;
		this.totalCount = totalCount;
	}
	
	public Result(Object t, long totalCount, int pageNum, int pageSize) {
		this.code = ErrorCode.Ok.getValue();
		this.msg = "";
		this.data = t;
		this.pageNum = pageNum;
		this.totalCount = totalCount;
		this.pageSize = pageSize;
	}

	public static Result serviceError(){
		return Error("服务器繁忙.");
	}
	
	public Object getData() {
		return data;
	}

	public void setData(Object data) {
		this.data = data;
	}

	public long getTotalCount() {
		return totalCount;
	}

	public void setTotalCount(long totalCount) {
		this.totalCount = totalCount;
	}

	public int getPageNum() {
		return pageNum;
	}

	public void setPageNum(int pageNum) {
		this.pageNum = pageNum;
	}

	public int getPageSize() {
		return pageSize;
	}

	public void setPageSize(int pageSize) {
		this.pageSize = pageSize;
	}

	public boolean isSuccess(){
		return this.getCode() == ErrorCode.Ok.getValue()||this.getCode() == ErrorCode.Success.getValue();
	}

	public static Result returnData(Object data){
		return new Result(data);
	}
	public static Result returnData(Object data, long total, int pageNum, int pageSize){
		return new Result(data,total,pageNum,pageSize);
	}
	public static Result Error(String msg){
		return new Result(ErrorCode.Error,msg);
	}
	public static Result Error(ErrorCode code ,String msg){
		return new Result(code,msg);
	}

	public static Result Ok(String msg){
		return new Result(ErrorCode.Ok,msg);
	}

	public static Result Ok(){
		return new Result(ErrorCode.Ok);
	}

	@Override
	public String toString() {
		return "Result [code=" + code + ", msg=" + msg + ", data=" + data
				+ ", totalCount=" + totalCount + ", pageNum=" + pageNum
				+ ", pageSize=" + pageSize + "]";
	}
	
	
}

package com.masterhr.user.vo;

import java.util.Map;

import com.fasterxml.jackson.annotation.JsonInclude;
import com.fasterxml.jackson.annotation.JsonInclude.Include;
import com.masterhr.user.message.MasterHrUserResponseType;

@JsonInclude(Include.NON_NULL)
public class MasterHrUserResponse {

	@JsonInclude(Include.NON_NULL)
	private MasterHrUserResponseType responseType;

	@JsonInclude(Include.NON_NULL)
	private Map<String, Object> respMap;

	@JsonInclude(Include.NON_NULL)
	private Object resp;

	@JsonInclude(Include.NON_NULL)
	private Integer totRecords;

	@JsonInclude(Include.NON_NULL)
	private Integer totPageNumb;

	@JsonInclude(Include.NON_NULL)
	private Integer pageSize;

	@JsonInclude(Include.NON_NULL)
	private Integer pageNumber;

	public Integer getTotPageNumb() {
		return totPageNumb;
	}

	public void setTotPageNumb(Integer totPageNumb) {
		this.totPageNumb = totPageNumb;
	}

	public MasterHrUserResponseType getResponseType() {
		return responseType;
	}

	public MasterHrUserResponse() {
	}

	public MasterHrUserResponse(MasterHrUserResponseType responseType, Object resp) {
		this.responseType = responseType;
		this.resp = resp;
	}

	public MasterHrUserResponse(MasterHrUserResponseType responseType, Object resp, Integer totRecords, Integer pageSize,
			Integer pageNumber) {
		super();
		this.responseType = responseType;
		this.resp = resp;
		this.totRecords = totRecords;
		this.pageSize = pageSize;
		this.pageNumber = pageNumber;
	}

	public MasterHrUserResponse(MasterHrUserResponseType responseType, Map<String, Object> respMap, Integer totRecords,
			Integer pageSize, Integer pageNumber) {
		super();
		this.responseType = responseType;
		this.respMap = respMap;
		this.totRecords = totRecords;
		this.pageSize = pageSize;
		this.pageNumber = pageNumber;
	}

	public MasterHrUserResponse(MasterHrUserResponseType responseType, Map<String, Object> respMap) {
		this.responseType = responseType;
		this.respMap = respMap;
	}

	@JsonInclude(Include.NON_NULL)
	public Integer getResponseCode() {
		return responseType.getCode();
	}

	@JsonInclude(Include.NON_NULL)
	public String getResponseTypeMsg() {
		return responseType.getMessage();
	}

	public void setResponseType(MasterHrUserResponseType responseType) {
		this.responseType = responseType;
	}

	@JsonInclude(Include.NON_NULL)
	public Map<String, Object> getRespMap() {
		return respMap;
	}

	public void setRespMap(Map<String, Object> respMap) {
		this.respMap = respMap;
	}

	@JsonInclude(Include.NON_NULL)
	public Object getResp() {
		return resp;
	}

	public void setResp(Object resp) {
		this.resp = resp;
	}

	public Integer getTotRecords() {
		return totRecords;
	}

	public void setTotRecords(Integer totRecords) {
		this.totRecords = totRecords;
	}

	public Integer getPageSize() {
		return pageSize;
	}

	public void setPageSize(Integer pageSize) {
		this.pageSize = pageSize;
	}

	public Integer getPageNumber() {
		return pageNumber;
	}

	public void setPageNumber(Integer pageNumber) {
		this.pageNumber = pageNumber;
	}
}
package com.masterhr.user.message;

public enum MasterHrUserResponseType {
	Success(251, "Success"), Failed(351, "Failed"); 
	private Integer code;
	private String message;
	private MasterHrUserResponseType() {}
	
	private MasterHrUserResponseType(Integer code, String message) {
		this.code = code;
		this.message = message;
	}
	
	public String getMessage() {
		return message;
	}
	
	public Integer getCode() {
		return code;
	}

}

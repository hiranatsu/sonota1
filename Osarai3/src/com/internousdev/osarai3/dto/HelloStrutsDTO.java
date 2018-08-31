package com.internousdev.osarai3.dto;

public class HelloStrutsDTO {
	private int userid;
	private String username;
	private String password;
	private String result;

	public int getUserid(){
		return userid;
	}
	public void setUserid(int userid){
		this.userid = userid;
	}

	public String getUsername(){
		return username;
	}
	public void setUsername(String username){
		this.username = username;
	}

	public String getPassword(){
		return password;
	}
	public void setPassword(String password){
		this.password = password;
	}

	public String getResult(){
		return result;
	}
	public void setResult(String result){
		this.result = result;
	}
}

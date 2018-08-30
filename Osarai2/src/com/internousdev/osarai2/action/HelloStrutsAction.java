package com.internousdev.osarai2.action;

import com.internousdev.osarai2.dao.HelloStrutsDAO;
import com.internousdev.osarai2.dto.HelloStrutsDTO;
import com.opensymphony.xwork2.ActionSupport;

public class HelloStrutsAction extends ActionSupport{

	private String result;

	public String execute(){
		String ret = ERROR;
		HelloStrutsDAO dao = new HelloStrutsDAO();
		HelloStrutsDTO dto = new HelloStrutsDTO();

		dto = dao.select();
		System.out.println(dto.getResult());

		result = dto.getResult();

		if(result.equals("MySQLと接続できるよ！")){
			ret = SUCCESS;
		}else{
			ret = ERROR;
		}
		return ret;
	}

	public String getResult(){
		return result;
	}
	public void setResult(String result){
		this.result = result;
	}

}

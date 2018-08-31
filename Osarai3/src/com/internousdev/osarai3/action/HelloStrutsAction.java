package com.internousdev.osarai3.action;

import java.util.ArrayList;
import java.util.List;
import java.util.Map;

import org.apache.struts2.interceptor.SessionAware;

import com.internousdev.osarai3.dao.HelloStrutsDAO;
import com.internousdev.osarai3.dto.HelloStrutsDTO;
import com.opensymphony.xwork2.ActionSupport;

public class HelloStrutsAction extends ActionSupport implements SessionAware{
	//	「helloStrutsDTOList」のリストを生成
	//　　sessionで保持するデータはkey=String型、value=Objectに設定。
	private List<HelloStrutsDTO> helloStrutsDTOList = new ArrayList<HelloStrutsDTO>();
	private Map<String, Object> session;

	//実行メソッド
	public String execute(){
		String ret = ERROR;
		HelloStrutsDAO dao = new HelloStrutsDAO();

		helloStrutsDTOList = dao.select();


		if(helloStrutsDTOList.size() > 0){
			//リストの要素数が1以上の時に、リストに追加。and　retにSUCCESSを入れる。
			session.put("helloStrutsDTOList", helloStrutsDTOList);
			ret = SUCCESS;
		}else{
			ret = ERROR;
		}
		return ret;
	}
	//SessionAwareをimplementsしているのでルールに従い記述。
	public void setSession(Map<String, Object> session){
		this.session = session;
	}


}

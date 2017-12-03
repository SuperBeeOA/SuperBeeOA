package cn.bdqn.j25.action;

import java.util.List;

import cn.bdqn.j25.pojo.Enter;
import cn.bdqn.j25.service.EnterService;

import com.opensymphony.xwork2.ActionSupport;

public class EnterAction extends ActionSupport {
	
	private EnterService enterService;
	
	public List<Enter> findAll(){
		return null;
		
	}
	
	public  Enter addOrUpdateEnter(Enter enter){
		return enter;
		
	}
	
	public void delEnter(Enter enter){
		
	}
}

package com.bjsxt.service;
import com.bjsxt.dao.CustomDao;
import com.bjsxt.dao.UserDAO;
import com.bjsxt.model.Custom;
import com.bjsxt.model.User;



public class CustomService {
	
	private CustomDao customDao;  
    
	public void add(Custom custom){
		customDao.buy(custom);
	}
	
	public CustomDao getCustomDao() {
		return customDao;
	}

	public void setCustomDao(CustomDao customDao) {
		this.customDao = customDao;
	}

	public CustomService() {
	}
	public CustomService(CustomDao customDao){
		this.customDao = customDao;
	}
	public void init(){
		System.out.println("init");
	}
	
	public void destory(){
		System.out.println("destroy");
	}
	
}

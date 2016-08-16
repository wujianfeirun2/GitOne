package com.bjsxt.service;
import org.junit.Test;
import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

import com.bjsxt.model.Custom;
import com.bjsxt.model.User;

//Dependency Injection
//Inverse of Control
public class CustomServiceTest {

	@Test
	public void testAdd1() throws Exception {
		ApplicationContext ctx = new ClassPathXmlApplicationContext("bean2.xml");
		
		CustomService service = (CustomService)ctx.getBean("customService");
		
		Custom u = new Custom();
		u.setUsername("zhangsan");
		u.setPassword("zhangsan");
		service.add(u);
		service.destory();
	}

}

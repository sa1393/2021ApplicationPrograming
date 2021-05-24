package com.yydh.myapp2;

import java.util.List;
import java.util.Map;
import java.util.Set;

import org.springframework.context.support.AbstractApplicationContext;
import org.springframework.context.support.GenericXmlApplicationContext;

public class CollectionBeanClient {
	public static void main(String[] args) {
//		AbstractApplicationContext factory = new GenericXmlApplicationContext("applicationContext3");
//		CollectionBean bean = (CollectionBean)factory.getBean("collectionBean");
//		Set<String> addressList = bean.getAddressList();
//		for(String address : addressList) {
//			System.out.println(address.toString());
//		}
		
		//Map
		AbstractApplicationContext factory = new GenericXmlApplicationContext("applicationContext4.xml");
		
		CollectionBean2 bean = (CollectionBean2)factory.getBean("collectionBean2");
		
		Map<String, String> addressList = bean.getAddressList();
		
		for(String address : addressList.keySet()) {
			String value = (String)addressList.get(address);
			System.out.println(address + " : " + value);
		}
		
	}
}

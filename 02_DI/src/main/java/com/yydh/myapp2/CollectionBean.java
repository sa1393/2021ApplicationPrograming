package com.yydh.myapp2;

import java.util.List;
import java.util.Set;

public class CollectionBean {
	//private List<String> addressList;
	private Set<String> addressList;
	public void setAddressList(Set<String> addressList) {
		this.addressList = addressList;
	}
	
	public Set<String> getAddressList() {
		return addressList;
	}
}

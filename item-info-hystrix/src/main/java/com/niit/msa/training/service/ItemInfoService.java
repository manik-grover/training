package com.niit.msa.training.service;

import java.util.HashMap;

public interface ItemInfoService {

	public HashMap<Long,String> getItemInfo() throws Exception;
	public HashMap<Long, String>  fallBackGetItemInfo(); 
	
}

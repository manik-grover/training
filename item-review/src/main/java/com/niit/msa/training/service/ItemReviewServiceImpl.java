package com.niit.msa.training.service;

import java.util.HashMap;

import org.springframework.stereotype.Component;

@Component
public class ItemReviewServiceImpl implements ItemReviewService{
	
	
	//@HystrixCommand(fallbackMethod="fallBackGetItemInfo")
	public HashMap<Long,String> getItemInfo()  {//throws Exception {
		
		
		HashMap<Long, String> itemInfo = new HashMap<Long,String>();
		try {

			
		itemInfo.put(1L,"Item 1");
		itemInfo.put(2L,"Item 2");
		
		
			Thread.sleep(500);
			//throw new Exception("Throwing custom exception");
		} catch (InterruptedException e) {
			// TODO Auto-generated catch block
			//throw e;
		}
		return itemInfo;
		
		//return itemInfo;
		
		
	}
	
	
	public HashMap<Long, String>  fallBackGetItemInfo() {
		
	HashMap<Long, String> itemInfoProxy = new HashMap<Long,String>();
		
	System.out.println("Calling falling back");	
	itemInfoProxy.put(1L,"Item 2");
		itemInfoProxy.put(2L,"Item 3");
	
		
		
		return itemInfoProxy;
	
	}

}

package com.niit.msa.training.service;

import java.util.HashMap;

public interface ItemReviewService {

	public HashMap<Long,String> getItemInfo(); // throws Exception;
	public HashMap<Long, String>  fallBackGetItemInfo(); 
	
}

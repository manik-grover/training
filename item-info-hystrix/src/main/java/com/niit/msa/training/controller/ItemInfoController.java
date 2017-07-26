package com.niit.msa.training.controller;

import java.util.HashMap;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.ResponseBody;
import org.springframework.web.bind.annotation.RestController;

import com.niit.msa.training.service.ItemInfoServiceImpl;

@RestController
public class ItemInfoController {
	

	ItemInfoServiceImpl itemInfoService = new ItemInfoServiceImpl();
	
	@GetMapping("/iteminfo-hystrix")
	public HashMap<Long, String> getItemInfo() throws Exception {
		return itemInfoService.getItemInfo();
	}

}

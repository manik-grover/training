package com.niit.msa.training.controller;

import java.util.HashMap;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.ResponseBody;
import org.springframework.web.bind.annotation.RestController;

import com.niit.msa.training.service.ItemReviewServiceImpl;

@RestController
public class ItemReviewController {
	

	ItemReviewServiceImpl itemReviewService = new ItemReviewServiceImpl();
	
	@GetMapping("/itemreview")
	public HashMap<Long, String> getItemInfo() throws Exception {
		return itemReviewService.getItemInfo();
	}

}

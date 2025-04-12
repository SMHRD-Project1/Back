package com.smhrd.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.ResponseBody;
import org.springframework.web.bind.annotation.RestController;

import com.smhrd.db.CCMapper;

@RestController
@CrossOrigin
public class CCRestController {
	
	
	@Autowired
	CCMapper mapper;
	
	@GetMapping("/login")
	@ResponseBody
	public boolean login(@RequestParam("id") String id, @RequestParam("name") String name){ 
//		KakaoDTO dto = mapper.checkAcount(id);
//		if (dto == null) {
//			mapper.join(id, name);
//			return true;
//		} else {
//			return true;
//		}
		System.out.println("inin");
		return true;
	}

	

}

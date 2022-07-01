package com.ainulid.app;

import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;

import lombok.extern.log4j.Log4j2;

@Log4j2
@RestController
public class AppController {

	@PostMapping("/api-one")
	public AppDto getApp(@RequestBody AppDto dto) {
		
		log.info("data incoming.."+dto.getId());
		
		return dto;
	}
	
}

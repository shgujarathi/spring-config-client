package com.example.demo;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.cloud.context.config.annotation.RefreshScope;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RefreshScope
@RestController
public class ResourceController {

	Logger logger = LoggerFactory.getLogger(ResourceController.class);

	@Value("${message:Message From Program}")
	private String message;

	@RequestMapping(value = "/getMessage")
	public String getMessage() {
		logger.info("Getting Message from Config Server" + message);
		return this.message;
	}

}

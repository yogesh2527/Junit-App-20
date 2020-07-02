package com.myproject;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

@SpringBootApplication
public class UnitTestingApplication {

	private Map<String , Object > cache = new HashMap<String , Object>();
	private static final String REST_URL ="www.google.com"

	public static void main(String[] args) {
		SpringApplication.run(UnitTestingApplication.class, args);
	}
// HIS-301 changes
public void loadDataCache()
	{
		// logic
	}


}

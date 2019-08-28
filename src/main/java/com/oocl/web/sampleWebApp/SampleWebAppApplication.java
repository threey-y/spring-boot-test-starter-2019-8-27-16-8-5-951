package com.oocl.web.sampleWebApp;

import org.junit.Test;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

@SpringBootApplication
public class SampleWebAppApplication {

	public static void main(String[] args) {
		SpringApplication.run(SampleWebAppApplication.class, args);
	}
	
	@Test
	public void shouldGotNameInBody() {
		
	}
}

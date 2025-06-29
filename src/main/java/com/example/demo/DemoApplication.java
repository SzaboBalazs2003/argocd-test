package com.example.demo;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

@SpringBootApplication
@RestController
public class DemoApplication {

	public static void main(String[] args) {
		SpringApplication.run(DemoApplication.class, args);
	}

	@GetMapping("/")
	public String hello(){
		return "Hello world!";
	}

	public record Response(String content) { }

	@GetMapping("/ping")
	public Response respont(@RequestParam(value = "text", defaultValue = "ping") String text){
		return new Response(text);
	}
}

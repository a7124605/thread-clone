package com.junior.thread_clone;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

import java.util.ArrayList;
import java.util.List;


@SpringBootApplication
public class ThreadCloneApplication {

	public static void main(String[] args) {
		SpringApplication.run(ThreadCloneApplication.class, args);

		List<String> stringList  = new ArrayList<>();
		stringList.add("Hello");




	}

}

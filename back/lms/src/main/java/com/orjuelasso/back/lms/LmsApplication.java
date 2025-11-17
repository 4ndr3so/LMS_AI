package com.orjuelasso.back.lms;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.CommandLineRunner;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

import com.orjuelasso.back.lms.testAOP.Test;

@SpringBootApplication
public class LmsApplication implements CommandLineRunner{

	@Autowired // Inject the Test bean created by Spring
    private Test testBean;
	
	public static void main(String[] args) {
		SpringApplication.run(LmsApplication.class, args);
	}

	// This method runs immediately after the application context is loaded
    @Override
    public void run(String... args) throws Exception {
        System.out.println("--- Starting AOP Test ---");
        testBean.display(); // Call the method on the managed bean
        System.out.println("--- AOP Test Complete ---");
    }

}

package edu.marcus.springboot;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

/**
 * @SpringBootApplication encapsulates @ComponentScan
 * @ComponentScan must be declared at the higher level package
 * If @SpringBootApplication or @ComponentScan is not at the higher level application, then
 * every package who should be scanned must be declared explicitly.
 */
@SpringBootApplication
public class StandaloneApplication {
	
	public static void main(String[] args) {
        SpringApplication.run(StandaloneApplication.class, args);
    }

}

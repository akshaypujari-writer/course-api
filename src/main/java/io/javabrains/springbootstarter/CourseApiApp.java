package io.javabrains.springbootstarter;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

/*This class is the execution entry point*/
//This annotation informs Spring that this is a Spring application

@SpringBootApplication
public class CourseApiApp {

	public static void main(String[] args) {
		
		/* Below line
		 * Sets up default config, starts spring application context, performs class
		 * path scan, starts tomcat server
		 * This is also a servlet container
		 */
		SpringApplication.run(CourseApiApp.class, args); 
	}

}

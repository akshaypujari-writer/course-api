package io.javabrains.springbootstarter.hello;

import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

/*This class is a spring controller
 * Whatever a method returns is automatically converted to Json and returned as the HTTP response
 * */

@RestController
public class HelloController {
	/* Request mappings to methods will take place in this class */
	
	@RequestMapping("/hello")
	public String sayHi() {
		return "Hi";
	}
	
	
	

}

package com.example.demo;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;



@RestController
public class Welcome {
	
 @GetMapping("/welcome")
    public String welcome() {
	  return "deploying sprring boot rest api application on aws using Elastic bean";
}
}



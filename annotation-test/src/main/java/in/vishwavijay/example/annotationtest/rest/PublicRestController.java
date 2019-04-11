package in.vishwavijay.example.annotationtest.rest;

import java.util.Date;

import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import in.vishwavijay.example.annotationtest.aspect.MyLogger;

@RestController
@MyLogger
public class PublicRestController {
	
	@RequestMapping("/status")
	public String status() {
		logger.info("Testing if the object is being passed or not.....");
		return new Date().toString() +" >> "+logger;
	}
	

}

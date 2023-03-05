package com.msaadhaar.controller;

import java.util.Random;

import org.springframework.web.bind.annotation.RequestMapping;

public class AadhaarController {
	@RequestMapping({ "/validateAadhaar" })
	public boolean hello() {
		Random rd = new Random(); // creating Random object
	    return rd.nextBoolean();
	}
}

package org.doctor.main.controller;

import java.util.Date;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class DoctorResource {
	private static final Logger LOGGER = LoggerFactory.getLogger(DoctorResource.class);

	@GetMapping("/doctor")
	public String doctorHMS() {
		String doctor = " Welcome TO Doctor Status In Hospital Management " + new Date();
		LOGGER.info("Doctor Message " + doctor);
		return doctor;
	}

}

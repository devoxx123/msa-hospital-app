package org.doctor.main.controller;

import java.util.Date;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class AppointmentResource {

	private static final Logger LOGGER = LoggerFactory.getLogger(AppointmentResource.class);

	@GetMapping("/app")
	public String appointmentHMS() {
		String app = "Welcome TO Appointment Status In Hospital Management " + new Date();
		LOGGER.info(" Appointment Message " + app);
		return app;
	}
}

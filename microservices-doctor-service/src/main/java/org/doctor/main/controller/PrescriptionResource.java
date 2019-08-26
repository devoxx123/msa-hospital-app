package org.doctor.main.controller;

import java.util.Date;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class PrescriptionResource {
	private static final Logger LOGGER = LoggerFactory.getLogger(PrescriptionResource.class);

	@GetMapping("/prescrp")
	public String prescriptionHMS() {
		String prescrp = "Welcome TO Prescription Status In Hospital Management" + new Date();
		LOGGER.info("Prescription Message " + prescrp);
		return prescrp;
	}
}


package org.pharmacist.main.controller;

import java.util.Date;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class pharmacistResource {

	private static final Logger LOGGER = LoggerFactory.getLogger(pharmacistResource.class);

	@GetMapping("/pharma")
	public String pharmaHMS() {
		String pharma = "Welcome TO Pharmacist Status In Hospital Management " + new Date();
		LOGGER.info("Pharmacist Message " + pharma);
		return pharma;
	}

}


package org.eadmin.main.controller;

import java.util.Date;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class EadminResource {

	private static final Logger LOGGER = LoggerFactory.getLogger(EadminResource.class);

	@GetMapping("/admin")
	public String adminHMS() {
		String admin = "Welcome TO Admin Status In Hospital Management " + new Date();
		LOGGER.info("Admin Message " + admin);
		return admin;
	}
}

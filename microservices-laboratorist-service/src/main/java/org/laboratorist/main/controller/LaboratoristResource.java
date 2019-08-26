
package org.laboratorist.main.controller;

import java.util.Date;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class LaboratoristResource {

	private static final Logger LOGGER = LoggerFactory.getLogger(LaboratoristResource.class);

	@GetMapping("/lab")
	public String laboratoristHMS() {
		String lab = "Welcome TO Laboratorist Status In Hospital Management " + new Date();
		LOGGER.info("Laboratorist Message " + lab);
		return lab;
	}

}

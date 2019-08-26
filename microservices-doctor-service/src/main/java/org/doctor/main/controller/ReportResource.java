package org.doctor.main.controller;

import java.util.Date;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class ReportResource {
	private static final Logger LOGGER = LoggerFactory.getLogger(ReportResource.class);

	@GetMapping("/report")
	public String reportHMS() {
		String report = "Welcome TO Report Status In Hospital Management " + new Date();
		LOGGER.info("Report Message " + report);
		return report;
	}

}

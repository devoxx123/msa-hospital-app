
package org.patient.web.controller;

import java.util.ArrayList;
import java.util.List;

import org.patient.web.exception.PatientExceptionErrorMessages;
import org.patient.web.exception.PatientNameAlreadyExistException;
import org.patient.web.exception.PatientNumberNotFoundException;
import org.patient.web.model.Patient;
import org.patient.web.service.PatientService;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/api/v1/patient")
public class PatientResource {

	private static final Logger LOGGER = LoggerFactory.getLogger(PatientResource.class);

	@Autowired
	private PatientService patientService;

	@RequestMapping(value = "/save", method = RequestMethod.POST)
	public ResponseEntity<String> createPatient(@RequestBody Patient patientDto) {
		LOGGER.info("Creating a new Patient Information : {}", patientDto);
		Patient patient = patientService.getPatientByPatientName(patientDto.getPatientName());
		if (patient != null && patient.getPatientName() != null) {
			LOGGER.error("Creating a new Patient Information A Patient with PatientNumber {} already exist",
					patientDto.getPatientName());
			throw new PatientNameAlreadyExistException(
					PatientExceptionErrorMessages.PATIENT_NAME_ALREADY_EXISTS.getErrMessage());
		}
		patientService.createPatient(patientDto);
		return new ResponseEntity<String>("Patient has been added sucessfully", HttpStatus.CREATED);
	}

	@RequestMapping(value = "/findall", method = RequestMethod.GET)
	public ResponseEntity<List<Patient>> findAll() {
		List<Patient> patients = new ArrayList<>();
		LOGGER.info("Fetching All Patients Information{}", patients);
		patientService.getAllPatients().forEach(patients::add);
		return new ResponseEntity<List<Patient>>(patients, HttpStatus.OK);
	}

	@RequestMapping(value = "/number", method = RequestMethod.GET)
	public ResponseEntity<Patient> fetchByPatientNumber(@RequestParam String patientNumber) {
		LOGGER.info("Fetching Patient with PatientNumber {}", patientNumber);
		Patient patient = patientService.getPatientByPatientNumber(patientNumber);
		if (null == patient) {
			LOGGER.error("Fetching Patient with PatientNumber {} not found.", patientNumber);
			throw new PatientNumberNotFoundException(
					PatientExceptionErrorMessages.PATIENT_NUMBER_NOT_AVAILABLE.getErrMessage());
		} else {
			return new ResponseEntity<Patient>(patient, HttpStatus.OK);
		}
	}

	@RequestMapping(value = "/name", method = RequestMethod.GET)
	public ResponseEntity<Patient> fetchByPatientName(@RequestParam String patientName) {
		LOGGER.info("Fetching Patient with PatientName {}", patientName);
		Patient patient = patientService.getPatientByPatientName(patientName);
		if (null == patient) {
			LOGGER.error("Fetching Patient with PatientName {} not found.", patientName);
			throw new PatientNameAlreadyExistException(
					PatientExceptionErrorMessages.PATIENT_NAME_NOT_AVAILABLE.getErrMessage());
		}
		return new ResponseEntity<Patient>(patient, HttpStatus.OK);
	}

	// TODO
	@RequestMapping(value = "/update", method = RequestMethod.POST)
	public ResponseEntity<String> updatePatientDetails(@RequestBody Patient patient,
			@RequestParam String patientNumber) {
		LOGGER.info("Updating Patient Information with patientNumber {}", patientNumber);
		Patient patients = patientService.getPatientByPatientNumber(patientNumber);
		if (null == patient) {
			LOGGER.error("Unable to update. Patient Information with PatientName {} not found.", patientNumber);
			throw new PatientNumberNotFoundException(
					PatientExceptionErrorMessages.PATIENT_NUMBER_NOT_AVAILABLE.getErrMessage());
		} else {
			patient.setPatientNumber(patientNumber);
			patientService.createPatient(patient);
			return new ResponseEntity<String>("Patient has been updated sucessfully", HttpStatus.OK);
		}
	}

	@RequestMapping(value = "/delete", method = RequestMethod.DELETE)
	public ResponseEntity<String> deleteByPatientNumber(@RequestParam Long id) {
		LOGGER.info("Deleting Patient Information with id {}", id);
		patientService.deletePatientById(id);
		return new ResponseEntity<String>("Patient has been deleted sucessfully", HttpStatus.OK);
	}
}

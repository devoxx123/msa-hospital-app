
package org.patient.web.repository;

import java.util.List;

import org.patient.web.model.Patient;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface PatientRepository extends JpaRepository<Patient, Long> {

	public Patient findByPatientNumber(String patientNumber);

	public List<Patient> findAll();

	public Patient findByPatientName(String patientName);

}

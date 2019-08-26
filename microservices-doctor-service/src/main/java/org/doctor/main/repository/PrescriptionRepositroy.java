package org.doctor.main.repository;

import org.doctor.main.model.Prescription;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface PrescriptionRepositroy extends JpaRepository<Prescription, Long> {

}

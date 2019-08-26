
package org.laboratorist.main.repository;

import org.laboratorist.main.model.Laboratorist;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface LaboratoristRepository extends JpaRepository<Laboratorist, Long> {

}

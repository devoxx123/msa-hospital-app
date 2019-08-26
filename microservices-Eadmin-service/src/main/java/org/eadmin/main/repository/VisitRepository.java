
package org.eadmin.main.repository;

import java.util.List;

import org.eadmin.main.model.Visit;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface VisitRepository extends JpaRepository<Visit, Integer> {

	public List<Visit> findByPetId(int petId);

	public List<Visit> findByPetIdIn(Iterable<Integer> petIds);
}

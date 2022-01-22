package org.gentTour.genTour.TiposRepository;
/*
 * 
 * @author Wesley Barreto Coelho
 * @since 22/01/2022
 * @version 0.01
  */
import java.util.List;

import org.gentTour.genTour.model.Tipos;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface TiposRepository extends JpaRepository<Tipos, Long>{
	
	public List<Tipos> findAllByTipoTurismoContainingIgnoreCase (String tipoTurismo);
}
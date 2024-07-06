package com.sesion9.clase.Repositories;

import com.sesion9.clase.Models.NivelAccesoModel;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface INivelAccesoRepository extends JpaRepository<NivelAccesoModel, Long> {
}

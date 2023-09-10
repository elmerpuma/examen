package com.epuma.microservicios.alumno.models.repository;

import com.epuma.microservicios.alumno.models.entity.Alumno;
import org.springframework.data.repository.CrudRepository;

public interface AlumnoRepository extends CrudRepository<Alumno,Long> {
}

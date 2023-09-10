package com.epuma.microservicios.alumno.services;

import com.epuma.microservicios.alumno.models.entity.Alumno;

import java.util.Optional;

public interface AlumnoService {
    Iterable<Alumno> findAll();

    Optional<Alumno> findById(Long id);

    Alumno save(Alumno alumno);

    void deleteById(Long id);
}

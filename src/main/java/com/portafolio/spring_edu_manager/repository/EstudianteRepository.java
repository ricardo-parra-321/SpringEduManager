package com.portafolio.spring_edu_manager.repository;

import com.portafolio.spring_edu_manager.model.Estudiante;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface EstudianteRepository extends JpaRepository<Estudiante, Long> {
}
package com.portafolio.spring_edu_manager.service;

import com.portafolio.spring_edu_manager.model.Estudiante;
import com.portafolio.spring_edu_manager.repository.EstudianteRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import java.util.List;

@Service
public class EstudianteService {

    @Autowired
    private EstudianteRepository estudianteRepository;

    public List<Estudiante> obtenerTodos() {
        return estudianteRepository.findAll();
    }

    public void guardarEstudiante(Estudiante estudiante) {
        estudianteRepository.save(estudiante);
    }
}
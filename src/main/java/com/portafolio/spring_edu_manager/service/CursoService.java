package com.portafolio.spring_edu_manager.service;

import com.portafolio.spring_edu_manager.model.Curso;
import com.portafolio.spring_edu_manager.repository.CursoRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import java.util.List;

@Service
public class CursoService {

    @Autowired
    private CursoRepository cursoRepository;

    public List<Curso> obtenerTodos() {
        return cursoRepository.findAll();
    }

    public void guardarCurso(Curso curso) {
        cursoRepository.save(curso);
    }
}
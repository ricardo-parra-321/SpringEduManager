package com.portafolio.spring_edu_manager.rest;

import com.portafolio.spring_edu_manager.model.Curso;
import com.portafolio.spring_edu_manager.repository.CursoRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;
import java.util.List;

@RestController
@RequestMapping("/api/cursos")
public class CursoRestController {

    @Autowired
    private CursoRepository cursoRepository;

    @GetMapping
    public List<Curso> obtenerTodos() {
        return cursoRepository.findAll();
    }

    @PostMapping
    public Curso crearCurso(@RequestBody Curso curso) {
        return cursoRepository.save(curso);
    }

    @PutMapping("/{id}")
    public Curso actualizarCurso(@PathVariable Long id, @RequestBody Curso curso) {
        curso.setId(id);
        return cursoRepository.save(curso);
    }

    @DeleteMapping("/{id}")
    public void eliminarCurso(@PathVariable Long id) {
        cursoRepository.deleteById(id);
    }
}
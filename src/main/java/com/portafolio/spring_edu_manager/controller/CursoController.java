package com.portafolio.spring_edu_manager.controller;

import com.portafolio.spring_edu_manager.model.Curso;
import com.portafolio.spring_edu_manager.service.CursoService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.PostMapping;

@Controller
public class CursoController {

    @Autowired
    private CursoService cursoService;

    @GetMapping("/cursos")
    public String mostrarCursos(Model model) {
        model.addAttribute("cursos", cursoService.obtenerTodos());
        return "cursos";
    }

    @PostMapping("/cursos")
    public String guardarCurso(@ModelAttribute Curso curso) {
        cursoService.guardarCurso(curso);
        return "redirect:/cursos";
    }
}
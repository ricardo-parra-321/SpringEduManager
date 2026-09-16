package com.portafolio.spring_edu_manager.controller;

import com.portafolio.spring_edu_manager.model.Estudiante;
import com.portafolio.spring_edu_manager.service.EstudianteService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.PostMapping;

@Controller
public class EstudianteController {

    @Autowired
    private EstudianteService estudianteService;

    @GetMapping("/estudiantes")
    public String mostrarEstudiantes(Model model) {
        model.addAttribute("estudiantes", estudianteService.obtenerTodos());
        return "estudiantes";
    }

    @PostMapping("/estudiantes")
    public String guardarEstudiante(@ModelAttribute Estudiante estudiante) {
        estudianteService.guardarEstudiante(estudiante);
        return "redirect:/estudiantes";
    }
}
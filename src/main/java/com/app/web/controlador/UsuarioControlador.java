package com.app.web.controlador;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.PostMapping;

import com.app.web.entidades.Usuario;
import com.app.web.servicio.UsuarioServicio;

@Controller
public class UsuarioControlador {

    @Autowired
    private UsuarioServicio servicio;

    @GetMapping("/usuario")
    public String listarUsuario(Model modelo) {
        modelo.addAttribute("usuarios", servicio.listarTodosLosUsuarios());
        return "usuario";
    }

    @GetMapping("/usuario/nuevo")
    public String mostrarFormularioDeRegistrarEstudiante(Model modelo) {
        Usuario estudiante = new Usuario();
        modelo.addAttribute("estudiante", estudiante);
        return "crear_usuario";
    }

    @PostMapping("/usuario")
    public String guardarUsuario(@ModelAttribute("usuario") Usuario usuario) {
        servicio.guardarUsuario(usuario);
        return "redirect:/usuario";
    }
}
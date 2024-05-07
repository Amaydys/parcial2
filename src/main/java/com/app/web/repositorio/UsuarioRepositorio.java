package com.app.web.repositorio;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.app.web.entidades.Usuario;



@Repository
public interface UsuarioRepositorio extends JpaRepository<Usuario, Long> {

}

package com.app.web;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.CommandLineRunner;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

import com.app.web.entidades.Usuario;
import com.app.web.repositorio.UsuarioRepositorio;

@SpringBootApplication
public class CrudParcialApplication implements CommandLineRunner {

	public static void main(String[] args) {
		SpringApplication.run(CrudParcialApplication.class, args);
	
	}
	@Autowired
    private UsuarioRepositorio repositorio;
		
		@Override
		public void run(String... args) throws Exception {
			Usuario usuario1 = new Usuario("Castañeda", 87, "ccwwcw", 25, "cac");
			repositorio.save(usuario1);
		}
	}



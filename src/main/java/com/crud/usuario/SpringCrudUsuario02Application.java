package com.crud.usuario;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.CommandLineRunner;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

import com.crud.usuario.entity.Usuario;
import com.crud.usuario.repository.IUsuarioRepository;



@SpringBootApplication
public class SpringCrudUsuario02Application implements CommandLineRunner {

	public static void main(String[] args) {
		SpringApplication.run(SpringCrudUsuario02Application.class, args);
		System.out.print("Go!");
	}
	
	@Autowired
	private IUsuarioRepository repositorio;

	@Override
	public void run(String... args) throws Exception {		
		
		/*
		 * Usuario usuario1 = new Usuario("Rbt", "Rodriguez", "correo1@gmail.com");
		 * Usuario usuario2 = new Usuario("Crl", "Sanchez", "correo2@gmail.com");
		 * 
		 * repositorio.save(usuario1); repositorio.save(usuario2);
		 */
	}
}

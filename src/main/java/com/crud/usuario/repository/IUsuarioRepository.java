package com.crud.usuario.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;
import com.crud.usuario.entity.Usuario;

@Repository
public interface IUsuarioRepository extends JpaRepository<Usuario, Integer> {

}

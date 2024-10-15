package com.crud.usuario.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import com.crud.usuario.entity.Articulo;

public interface IArticuloRepository extends JpaRepository<Articulo, Integer> { }

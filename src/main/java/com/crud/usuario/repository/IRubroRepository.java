package com.crud.usuario.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import com.crud.usuario.entity.Rubro;

public interface IRubroRepository extends JpaRepository<Rubro, Integer> { }

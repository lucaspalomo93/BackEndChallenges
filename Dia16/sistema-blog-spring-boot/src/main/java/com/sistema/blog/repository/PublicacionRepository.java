package com.sistema.blog.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.sistema.blog.model.Publicacion;

@Repository
public interface PublicacionRepository extends JpaRepository<Publicacion, Long>{

}

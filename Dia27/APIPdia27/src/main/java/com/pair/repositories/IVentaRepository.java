package com.pair.repositories;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.pair.models.Venta;

@Repository
public interface IVentaRepository extends JpaRepository<Venta, Long>{

}

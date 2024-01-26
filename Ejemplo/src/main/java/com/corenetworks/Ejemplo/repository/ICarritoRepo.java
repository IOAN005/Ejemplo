package com.corenetworks.Ejemplo.repository;

import com.corenetworks.Ejemplo.modelo.Carrito;
import org.springframework.data.jpa.repository.JpaRepository;

public interface ICarritoRepo extends JpaRepository<Carrito,Integer> {
}

package com.corenetworks.Ejemplo.service;

import com.corenetworks.Ejemplo.modelo.Carrito;

import java.util.List;

public interface ICarritoService {
    Carrito insertar (Carrito c);
    Carrito modificar(Carrito c);
    void eliminar (int id);
    Carrito consultarUno(int id);
    List<Carrito> consultartodos();


}

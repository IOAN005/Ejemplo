package com.corenetworks.Ejemplo.service;

import com.corenetworks.Ejemplo.modelo.Carrito;
import com.corenetworks.Ejemplo.repository.ICarritoRepo;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;
@Service

public class CarritoServiceImpl implements ICarritoService{
    @Autowired
    private ICarritoRepo repoCarrito;
    @Override
    public Carrito insertar(Carrito c) {
        return repoCarrito.save(c);
    }

    @Override
    public Carrito modificar(Carrito c) {
        return repoCarrito.save(c);
    }

    @Override
    public void eliminar(int id) { repoCarrito.deleteById(id);


    }

    @Override
    public Carrito consultarUno(int id) {
        return repoCarrito.findById(id).orElse(new Carrito());
    }

    @Override
    public List<Carrito> consultartodos() {
        return repoCarrito.findAll();
    }
}

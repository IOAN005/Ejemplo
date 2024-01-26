package com.corenetworks.Ejemplo.controlador;

import com.corenetworks.Ejemplo.modelo.Carrito;
import com.corenetworks.Ejemplo.service.ICarritoService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("/carritos")

public class ControladorCarrito {
    @Autowired
    private ICarritoService sCarrito;

    @PostMapping
    public Carrito insertar(@RequestBody Carrito c){
        return sCarrito.insertar(c);
    }
    @GetMapping
    public List<Carrito>consultarTodos(){
        return sCarrito.consultartodos();
    }
    @GetMapping("/{id}")
    public Carrito consultarUno(@PathVariable(name="id") int id){
        return sCarrito.consultarUno(id);
    }
    @PutMapping
    public Carrito modificar(@RequestBody Carrito c){
        return sCarrito.modificar(c);
    }
    @DeleteMapping("/{id}")
    public void eliminar(@PathVariable(name="id") int id){
        sCarrito.eliminar(id);
    }
}

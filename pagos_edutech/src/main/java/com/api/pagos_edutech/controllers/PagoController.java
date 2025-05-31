package com.api.pagos_edutech.controllers;

import com.api.pagos_edutech.models.ModeloPagos;
import com.api.pagos_edutech.services.ServiciosPago;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.*;

import java.util.ArrayList;
import java.util.Optional;

import static org.springframework.data.jpa.domain.AbstractPersistable_.id;

@RestController
@RequestMapping("/api/Pagos")
public class PagoController {

    @Autowired
    private ServiciosPago serviciosPago;

    @GetMapping()
    public ArrayList<ModeloPagos> getUsers(){
        return this.serviciosPago.getusers();
    }
    @PostMapping
    public ModeloPagos saveUser(@RequestBody ModeloPagos tablapagos){
        return this.serviciosPago.saveUser(tablapagos);
    }

    @GetMapping(path = "/{id}")
    public Optional<ModeloPagos> getUserById(@PathVariable("id") Long id){
        return this.serviciosPago.getById(id);
    }
    @PutMapping(path = "/{id}")
    public ModeloPagos updateUserById(@RequestBody ModeloPagos request,@PathVariable("id") Long id){
        return this.serviciosPago.updateById(request,id);
    }
    @DeleteMapping(path = "/{id}")
    public String deleteById(@PathVariable("id") Long id){
        boolean ok = this.serviciosPago.deleteUser(id);
        if(ok){
            return "El usuario con id:"+id+"ha sido eliminado";
        }else{
            return "Ocurrio un error, el usuario con id:"+id+"no ha sido eliminado";
        }
    }
}

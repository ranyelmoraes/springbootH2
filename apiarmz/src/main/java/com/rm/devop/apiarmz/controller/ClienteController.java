package com.rm.devop.apiarmz.controller;


import com.rm.devop.apiarmz.model.Cliente;
import com.rm.devop.apiarmz.repository.ClienteRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.web.bind.annotation.*;

import java.util.List;


@RestController
@RequestMapping("/clientes")

public class ClienteController {

    @Autowired
    private ClienteRepository clienteRepository;

    @GetMapping
    public List listar(){
        return clienteRepository.findAll();
    }


    @PostMapping
    @ResponseStatus(HttpStatus.CREATED)
    public Cliente adicionar (Cliente cliente){
        return clienteRepository.save(cliente);

    }



}

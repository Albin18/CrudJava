package com.crudo.CrudSpringBoot.controller;
import com.crudo.CrudSpringBoot.modelo.Cliente;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import com.crudo.CrudSpringBoot.interfacesServices.interClienteService;

import java.util.List;

@Controller
@RequestMapping
public class Controlador {

    @Autowired
    private interClienteService service;

    @GetMapping("/listar")
    public String listar(Model model){
    List<Cliente>clientes =  service.listar();
    model.addAttribute("clientes", clientes);
        return "index";
    }

}

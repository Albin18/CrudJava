package com.crudo.CrudSpringBoot.controller;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;
import com.crudo.CrudSpringBoot.interfacesServices.interClienteService;

@Controller
@RequestMapping
public class Controlador {



    public String listar(Model model){
    return "index";
}

}

package com.crudo.CrudSpringBoot.services;

import com.crudo.CrudSpringBoot.interfaces.interCliente;
import com.crudo.CrudSpringBoot.interfacesServices.interClienteService;
import com.crudo.CrudSpringBoot.modelo.Cliente;
import org.springframework.beans.factory.annotation.Autowired;

import java.util.List;
import java.util.Optional;

public class ClienteService implements interClienteService{

    @Autowired
    private interCliente data;
    @Override
    public List<Cliente> listar() {
        return (List<Cliente>) data.findAll();
    }

    @Override
    public Optional<Cliente> listarId(int id) {
        return Optional.empty();
    }

    @Override
    public int save(Cliente c) {
        return 0;
    }

    @Override
    public void delete(int id) {

    }
}

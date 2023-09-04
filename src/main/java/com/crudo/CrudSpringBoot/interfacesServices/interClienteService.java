package com.crudo.CrudSpringBoot.interfacesServices;


import com.crudo.CrudSpringBoot.modelo.Cliente;

import java.util.List;
import java.util.Optional;

public interface interClienteService{

     public List<Cliente> listar();

     public Optional<Cliente> listarId(int id);

     public int save(Cliente c);
     public void delete(int id);


}

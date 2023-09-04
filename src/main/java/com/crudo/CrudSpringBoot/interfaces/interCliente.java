package com.crudo.CrudSpringBoot.interfaces;

import com.crudo.CrudSpringBoot.modelo.Cliente;
import org.springframework.data.repository.CrudRepository;

public interface interCliente extends CrudRepository <Cliente , Integer> {



}

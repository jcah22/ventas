package com.ventas.service;

import java.util.List;
import java.util.Optional;

import com.ventas.model.Cliente;

public interface IClienteService {

	public List<Cliente> findAll();

	public Optional<Cliente> findById(Integer id);
	
	public Cliente create(Cliente cliente);
	
	public Cliente update(Cliente cliente );
	
	public void delete (Integer id);

}
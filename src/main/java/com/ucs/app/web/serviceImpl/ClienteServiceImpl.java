/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.ucs.app.web.serviceImpl;

import com.ucs.app.web.model.Cliente;
import com.ucs.app.web.repository.ClienteRepository;
import com.ucs.app.web.service.ClienteService;
import java.util.List;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class ClienteServiceImpl implements ClienteService{
    
    @Autowired
    private ClienteRepository repository;
    
    @Override
    public List<Cliente> readAll() {
        return repository.findAll();
    }

    @Override
    public Cliente create(Cliente cliente) {
        return repository.save(cliente);
    }

    @Override
    public Cliente update(Cliente cliente) {
        return repository.save(cliente);
    }

    @Override
    public Cliente read(int idcliente) {
        return repository.findById(idcliente).get();
    }

    @Override
    public void delete(int idcliente) {
        repository.deleteById(idcliente);
    }
    
}

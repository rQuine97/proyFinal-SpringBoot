/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.ucs.app.web.serviceImpl;

import com.ucs.app.web.model.Rol;
import com.ucs.app.web.repository.RolRepository;
import com.ucs.app.web.service.RolService;
import java.util.List;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

/**
 *
 * @author rquin
 */
@Service
public class RolServiceImpl implements RolService{
    
    @Autowired
    private RolRepository repository;
    
    @Override
    public List<Rol> readAll() {
        return repository.findAll();
    }

    @Override
    public Rol create(Rol rol) {
        return repository.save(rol);
    }

    @Override
    public Rol update(Rol rol) {
        return repository.save(rol);
    }

    @Override
    public Rol read(String idrol) {
        return repository.findById(idrol).get();
    }

    @Override
    public void delete(String idrol) {
        repository.deleteById(idrol);
    }
    
}

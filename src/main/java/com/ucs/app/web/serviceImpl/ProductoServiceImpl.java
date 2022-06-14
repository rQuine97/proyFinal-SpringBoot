/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.ucs.app.web.serviceImpl;

import com.ucs.app.web.model.Producto;
import com.ucs.app.web.repository.ProductoRepository;
import com.ucs.app.web.service.ProductoService;
import java.util.List;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class ProductoServiceImpl implements ProductoService{

    @Autowired
    private ProductoRepository productorepository;

    @Override
    public List<Producto> readAll() {
        return productorepository.findAll();
    }

    @Override
    public Producto create(Producto producto) {
        return productorepository.save(producto);
    }

    @Override
    public Producto update(Producto producto) {
        return productorepository.save(producto);
    }

    @Override
    public Producto read(int idproducto) {
        return productorepository.findById(idproducto).get();
    }

    @Override
    public void delete(int idproducto) {
        productorepository.deleteById(idproducto);
    }
    
    
    
}

/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Interface.java to edit this template
 */
package com.ucs.app.web.service;

import com.ucs.app.web.model.Cliente;
import java.util.List;


public interface ClienteService {
    public List<Cliente> readAll();
    public Cliente create(Cliente cliente);
    public Cliente update(Cliente cliente);
    public Cliente read(int idcliente);
    public void delete(int idcliente);
}

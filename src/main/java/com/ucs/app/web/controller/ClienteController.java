/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.ucs.app.web.controller;

import com.ucs.app.web.model.Cliente;
import com.ucs.app.web.service.ClienteService;

import org.springframework.beans.factory.annotation.Autowired;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@Controller


public class ClienteController {
    
    @Autowired
    private ClienteService service;
    
    @GetMapping({"/index","/"})
    public String index() {
        return "index";
    }
    
    //@GetMapping({"/clientes","/"})
    @GetMapping("/clientes")
    public String getClientes(Model modelo) {
        modelo.addAttribute("clientes", service.readAll());
        return "clientes";
    }
    
    @GetMapping("/clientes/nuevo")
    public String showFormRegisterCliente(Model modelo){
        Cliente cliente = new Cliente();
        modelo.addAttribute("cliente", cliente);
        return "crear_cliente";
    }
    
    @PostMapping("/clientes")
    public String addCliente(@ModelAttribute("cliente") Cliente cliente){
        service.create(cliente);
        return "redirect:/clientes";
    }
    
    @GetMapping("/clientes/editar/{idcliente}")
    public String showFormCliente(@PathVariable Integer idcliente, Model modelo){
        modelo.addAttribute("cliente", service.read(idcliente));
        return "editar_cliente";
    }
    
    @PostMapping("/clientes/{idcliente}")
    public String editCliente(@PathVariable Integer idcliente, @ModelAttribute("cliente") Cliente cliente, Model modelo){
        Cliente clienteExistente = service.read(idcliente);
        clienteExistente.setIdcliente(idcliente);
        clienteExistente.setNombres(cliente.getNombres());
        clienteExistente.setApellidos(cliente.getApellidos());
        clienteExistente.setDni(cliente.getDni());
        clienteExistente.setTelefono(cliente.getTelefono());
        clienteExistente.setCorreo(cliente.getCorreo());
        
        service.update(cliente);
        return "redirect:/clientes";
    }
    
    @GetMapping("/clientes/{idcliente}")
    public String deleteCliente(@PathVariable Integer idcliente){
        service.delete(idcliente);
        return "redirect:/clientes";
    }
}

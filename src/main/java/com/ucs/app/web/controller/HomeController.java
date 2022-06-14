/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.ucs.app.web.controller;

import com.ucs.app.web.model.Cliente;
import com.ucs.app.web.model.Producto;
import com.ucs.app.web.model.Rol;
import com.ucs.app.web.service.ClienteService;
import com.ucs.app.web.service.ProductoService;
import com.ucs.app.web.service.RolService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;



@Controller
public class HomeController {
    
    @Autowired
    private ClienteService clienteservice;
    
    @Autowired
    private ProductoService productoservice;
    
    @Autowired
    private RolService rolservice;
    
    @GetMapping({"/index","/"})
    public String index() {
        return "index";
    }
    
    
    //Clientes
    @GetMapping("/clientes")
    public String getClientes(Model modelo) {
        modelo.addAttribute("clientes", clienteservice.readAll());
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
        clienteservice.create(cliente);
        return "redirect:/clientes";
    }
    
    @GetMapping("/clientes/editar/{idcliente}")
    public String showFormCliente(@PathVariable Integer idcliente, Model modelo){
        modelo.addAttribute("cliente", clienteservice.read(idcliente));
        return "editar_cliente";
    }
    
    @PostMapping("/clientes/{idcliente}")
    public String editCliente(@PathVariable Integer idcliente, @ModelAttribute("cliente") Cliente cliente, Model modelo){
        Cliente clienteExistente = clienteservice.read(idcliente);
        clienteExistente.setIdcliente(idcliente);
        clienteExistente.setNombres(cliente.getNombres());
        clienteExistente.setApellidos(cliente.getApellidos());
        clienteExistente.setDni(cliente.getDni());
        clienteExistente.setTelefono(cliente.getTelefono());
        clienteExistente.setCorreo(cliente.getCorreo());
        
        clienteservice.update(cliente);
        return "redirect:/clientes";
    }
    
    @GetMapping("/clientes/{idcliente}")
    public String deleteCliente(@PathVariable Integer idcliente){
        clienteservice.delete(idcliente);
        return "redirect:/clientes";
    }
    
    //Productos
    
    @GetMapping("/productos")
    public String getProductos(Model modelo) {
        modelo.addAttribute("productos", productoservice.readAll());
        return "productos";
    }
    
    @GetMapping("/productos/nuevo")
    public String showFormRegisterProducto(Model modelo){
        Producto producto = new Producto();
        modelo.addAttribute("producto", producto);
        return "crear_producto";
    }
    
    @PostMapping("/productos")
    public String addProducto(@ModelAttribute("producto") Producto producto){
        productoservice.create(producto);
        return "redirect:/productos";
    }
    
    @GetMapping("/productos/editar/{idproducto}")
    public String showFormProducto(@PathVariable Integer idproducto, Model modelo){
        modelo.addAttribute("producto", productoservice.read(idproducto));
        return "editar_producto";
    }
    
    @PostMapping("/productos/{idproducto}")
    public String editProducto(@PathVariable Integer idproducto, @ModelAttribute("producto") Producto producto, Model modelo){
        Producto productoExistente = productoservice.read(idproducto);
        productoExistente.setIdproducto(idproducto);
        productoExistente.setNombre(producto.getNombre());
        productoExistente.setPrecio(producto.getPrecio());
        productoExistente.setMarca(producto.getMarca());
        productoExistente.setStock(producto.getStock());
        productoservice.update(producto);
        return "redirect:/productos";
    }
    
    @GetMapping("/productos/{idproducto}")
    public String deleteProducto(@PathVariable Integer idproducto){
        productoservice.delete(idproducto);
        return "redirect:/productos";
    }
    
    
    //Rol
    
    @GetMapping("/roles")
    public String getRoles(Model modelo) {
        modelo.addAttribute("roles", rolservice.readAll());
        return "roles";
    }
    
    
    @GetMapping("/roles/nuevo")
    public String showFormRegisterRol(Model modelo){
        Rol rol = new Rol();
        modelo.addAttribute("rol", rol);
        return "crear_rol";
    }
   
    @PostMapping("/roles")
    public String addRol(@ModelAttribute("rol") Rol rol){
        rolservice.create(rol);
        return "redirect:/roles";
    }
    
    @GetMapping("/roles/editar/{idrol}")
    public String showFormRol(@PathVariable String idrol, Model modelo){
        modelo.addAttribute("rol", rolservice.read(idrol));
        return "editar_rol";
    }
    
    @PostMapping("/roles/{idrol}")
    public String editRol(@PathVariable String idrol, @ModelAttribute("rol") Rol rol, Model modelo){
        Rol rolExistente = rolservice.read(idrol);
        rolExistente.setIdrol(rol.getIdrol());
        rolExistente.setNombre(rol.getNombre());
        rolExistente.setEstado(rol.getEstado());
        rolservice.update(rol);
        return "redirect:/roles";
    }
    
  
    @GetMapping("/roles/{idrol}")
    public String deleteRol(@PathVariable String idrol){
        rolservice.delete(idrol);
        return "redirect:/roles";
    }
    
    
}

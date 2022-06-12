/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Interface.java to edit this template
 */
package com.ucs.app.web.repository;

import com.ucs.app.web.model.Cliente;
import org.springframework.data.jpa.repository.JpaRepository;

/**
 *
 * @author rquin
 */
public interface ClienteRepository extends JpaRepository<Cliente, Integer>{
    
}

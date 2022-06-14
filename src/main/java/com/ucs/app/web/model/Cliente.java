/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.ucs.app.web.model;

import java.util.logging.Logger;
import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.Table;
import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

@AllArgsConstructor
@Getter
@Setter
@NoArgsConstructor
@Entity
@Table(name = "clientes")
public class Cliente {
    
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private int idcliente;
    
    @Column(name = "nombres",nullable = false, length = 45)
    private String nombres;
    
    @Column(name = "apellidos",nullable = false, length = 45)
    private String apellidos;
    
    @Column(name = "dni", nullable = false, length = 8, unique = true)
    private String dni;
    
    @Column(name = "telefono",nullable = false, length = 9)
    private String telefono;
    
    @Column(name = "correo",nullable = false, length = 45)
    private String correo;
    

    @Override
    public String toString() {
        return "Cliente{" + "idcliente=" + idcliente + ", nombres=" + nombres + ", apellidos=" + apellidos + ", dni=" + dni + ", telefono=" + telefono + ", correo=" + correo + '}';
    }

    
    
    
}

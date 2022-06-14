/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.ucs.app.web.model;

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


//@AllArgsConstructor
//@Getter
//@Setter
//@NoArgsConstructor
@Entity
@Table(name = "roles")
public class Rol {
    
    @Id
    //@GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(name = "idrol",nullable = false, length = 10, unique = true)
    private String idrol;
    
    @Column(name = "nombre",nullable = false, length = 45)
    private String nombre;
    
    @Column(name = "estado",nullable = false, length = 45)
    private String estado;

    public Rol(){
        
    }
    
    public Rol(String idrol, String nombre, String estado) {
        this.idrol = idrol;
        this.nombre = nombre;
        this.estado = estado;
    }

    public String getIdrol() {
        return idrol;
    }

    public void setIdrol(String idrol) {
        this.idrol = idrol;
    }

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public String getEstado() {
        return estado;
    }

    public void setEstado(String estado) {
        this.estado = estado;
    }

    @Override
    public String toString() {
        return "Rol{" + "idrol=" + idrol + ", nombre=" + nombre + ", estado=" + estado + '}';
    }
    
    
}

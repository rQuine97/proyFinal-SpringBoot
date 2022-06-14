/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Interface.java to edit this template
 */
package com.ucs.app.web.service;

import com.ucs.app.web.model.Rol;
import java.util.List;

/**
 *
 * @author rquin
 */
public interface RolService {
    public List<Rol> readAll();
    public Rol create(Rol rol);
    public Rol update(Rol rol);
    public Rol read(String idrol);
    public void delete(String idrol);
}

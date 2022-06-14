
package com.ucs.app.web.service;

import com.ucs.app.web.model.Producto;
import java.util.List;


public interface ProductoService {
    public List<Producto> readAll();
    public Producto create(Producto producto);
    public Producto update(Producto producto);
    public Producto read(int idproducto);
    public void delete(int idproducto);
}

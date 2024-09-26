package com.obando.inventario.services;

import com.obando.inventario.models.Producto;

import java.util.List;

public interface IProductService {
    List<Producto> listarProductos();
    Producto buscarProductoPorId(Long id);
    void guardarProducto(Producto producto);
    void eliminarProductoPorId(Long id);
}

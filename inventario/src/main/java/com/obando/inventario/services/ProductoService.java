package com.obando.inventario.services;

import com.obando.inventario.models.Producto;
import com.obando.inventario.repositories.IProductRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class ProductoService implements IProductService{

    @Autowired
    private IProductRepository productRepository;

    @Override
    public List<Producto> listarProductos() {
        return productRepository.findAll();
    }

    @Override
    public Producto buscarProductoPorId(Long id) {
        return productRepository.findById(id).orElse(null);
    }

    @Override
    public void guardarProducto(Producto producto) {
        this.productRepository.save(producto);
    }

    @Override
    public void eliminarProductoPorId(Long id) {
        productRepository.deleteById(id);
    }
}

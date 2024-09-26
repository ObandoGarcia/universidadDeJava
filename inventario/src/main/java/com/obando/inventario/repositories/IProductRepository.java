package com.obando.inventario.repositories;

import com.obando.inventario.models.Producto;
import org.springframework.data.jpa.repository.JpaRepository;

public interface IProductRepository extends JpaRepository<Producto, Long> {

}

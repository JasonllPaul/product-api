package com.example.productapi.service;

import com.example.productapi.entity.Producto;
import com.example.productapi.repository.ProductoRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.stereotype.Service;

import java.util.HashMap;
import java.util.List;

@Service
public class ProductoService {

    // Repository
    @Autowired
    ProductoRepository productoRepository;


    public ResponseEntity getProductos() {
        HashMap<String, Object> map = new HashMap<>();
        List productos = productoRepository.findAll();
        map.put("code", HttpStatus.OK);
        map.put("producto", productos);
        return new ResponseEntity(map, HttpStatus.OK);
    }

    /**
     * This method allows to save or update a product
     *
     * @param producto player saved
     */
    public void saveOrUpdate(Producto producto) {
        productoRepository.save(producto);
    }

    /**
     * This method allows to remove a product by id
     *
     * @param id of the product to remove
     */
    public void deleteProducto(Long id) {
        productoRepository.deleteById(id);
    }

    /**
     * To remove all products
     */
    public void deleteAll() {
        productoRepository.deleteAll();
    }

}

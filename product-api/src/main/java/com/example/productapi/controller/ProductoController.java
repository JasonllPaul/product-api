package com.example.productapi.controller;

import com.example.productapi.entity.Producto;
import com.example.productapi.service.ProductoService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

@RestController
@RequestMapping(path = "api/v1/products")
public class ProductoController {

    // service
    @Autowired
    private final ProductoService productoService;

    public ProductoController(ProductoService productoService){
        this.productoService = productoService;
    }

    @GetMapping()
    public ResponseEntity getAll(){return productoService.getProductos();}

    @PostMapping
    public void save(@RequestBody Producto producto){
        productoService.saveOrUpdate(producto);
    }

    @DeleteMapping("/{id}")
    public void delete(@PathVariable("id") Long id){
        productoService.deleteProducto(id);
    }

    @DeleteMapping()
    public void deleteAll(){
        productoService.deleteAll();
    }


}

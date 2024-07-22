package br.com.api.cmv.teste_sifat.modules.cmv.controllers;

import br.com.api.cmv.teste_sifat.modules.cmv.DTO.LeastSoldProductDTO;
import br.com.api.cmv.teste_sifat.modules.cmv.entities.ProductEntity;
import br.com.api.cmv.teste_sifat.modules.cmv.services.ProductService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

@RestController
@RequestMapping("/products")
public class ProductController {

    @Autowired
    private ProductService productService;

    @GetMapping("/all")
    public List<ProductEntity> getAllProducts() {
        return productService.getAllProducts();
    }

    @GetMapping("least-sold-products")
    public ResponseEntity<List<LeastSoldProductDTO>> getLeastSoldProducts() {
        List<LeastSoldProductDTO> leastSoldProducts = productService.getLeastSoldProducts();
        return ResponseEntity.ok(leastSoldProducts);
    }

}

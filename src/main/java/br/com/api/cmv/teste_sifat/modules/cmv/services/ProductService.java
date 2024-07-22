package br.com.api.cmv.teste_sifat.modules.cmv.services;

import br.com.api.cmv.teste_sifat.modules.cmv.DTO.LeastSoldProductDTO;
import br.com.api.cmv.teste_sifat.modules.cmv.entities.ProductEntity;
import br.com.api.cmv.teste_sifat.modules.cmv.projections.LeastSoldProductProjection;
import br.com.api.cmv.teste_sifat.modules.cmv.repository.ProductRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.stream.Collectors;

@Service
public class ProductService {

    @Autowired
    private ProductRepository productRepository;

    public List<ProductEntity> getAllProducts() {
        return productRepository.findAll();
    }

    public List<LeastSoldProductDTO> getLeastSoldProducts() {
        List<LeastSoldProductProjection> projections = productRepository.findLeastSoldProducts();

        return projections.stream().map(projection -> new LeastSoldProductDTO(
                projection.getProductId(),
                projection.getProductName(),
                projection.getTotalQuantity()
        )).collect(Collectors.toList());

    }

}

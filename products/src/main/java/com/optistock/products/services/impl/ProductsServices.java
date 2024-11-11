package com.optistock.products.services.impl;


import com.optistock.products.converters.ProductsConverter;
import com.optistock.products.dtos.ProductEntryDTO;
import com.optistock.products.dtos.ProductExitDTO;
import com.optistock.products.models.Product;
import com.optistock.products.repository.ProductsRepository;
import com.optistock.products.services.IProductsServices;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.ArrayList;
import java.util.List;

@Service
public class ProductsServices implements IProductsServices {

    @Autowired
    ProductsRepository productsRepository;

    @Autowired
    ProductsConverter productsConverter;


    @Override
    public List<ProductExitDTO> getAllProducts() {
        try{
            List<Product> products =  productsRepository.findAll();
            List<ProductExitDTO> productExitDTOS = new ArrayList<>();
            products.stream().forEach(product -> productExitDTOS.add(productsConverter.productsToProductsExitDTO(product)));
            return productExitDTOS;
        }catch (Exception e){
            throw new RuntimeException(e);
        }

    }

    @Override
    public void createProduct(ProductEntryDTO productsDTO) {
        try {
            Product product = productsConverter.productsEntryDTOToProduct(productsDTO);
            productsRepository.saveIfNotExists(product);
        }catch (Exception e){
            throw new RuntimeException(e);
        }
    }

    @Override
    public ProductExitDTO updateProduct(ProductEntryDTO productEntryDTO) {
        try {
            Product product = productsRepository.findByNameOrException(productEntryDTO.getName());
            productsConverter.productsEntryDTOToProduct(productEntryDTO);
            productsRepository.save(product);
            ProductExitDTO productExitDTO = productsConverter.productsToProductsExitDTO(product);
            return productExitDTO;

        }catch (Exception e) {
            throw new RuntimeException(e);
        }
    }

    @Override
    public void deleteProduct(String id) {
        productsRepository.findByIdOrException(id);
        productsRepository.deleteById(id);

    }
}

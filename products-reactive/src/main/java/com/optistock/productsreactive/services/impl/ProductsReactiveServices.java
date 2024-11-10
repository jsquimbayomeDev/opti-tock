package com.optistock.productsreactive.services.impl;


import com.optistock.productsreactive.converters.ProductConverter;
import com.optistock.productsreactive.dtos.ProductExitDTO;
import com.optistock.productsreactive.domain.repository.ProductsReactiveRepository;
import com.optistock.productsreactive.services.IProductsReactiveServices;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import reactor.core.publisher.Flux;

import java.util.LinkedList;

@Service
public class ProductsReactiveServices implements IProductsReactiveServices {

    @Autowired
    ProductsReactiveRepository productsReactiveRepository;

    @Autowired
    ProductConverter ProductConverter;


    @Override
    public Flux<LinkedList<ProductExitDTO>> getProductsByFilters(String email, String password) {
        return null;
    }

    @Override
    public Flux<LinkedList<ProductExitDTO>> getProductsToOutOfStock() {

    }

    @Override
    public Flux<LinkedList<ProductExitDTO>> getProductsOutOfStock() {
        return null;
    }
}

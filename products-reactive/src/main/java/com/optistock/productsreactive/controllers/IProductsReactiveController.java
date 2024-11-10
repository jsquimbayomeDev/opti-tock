package com.optistock.productsreactive.controllers;


import com.optistock.productsreactive.dtos.ProductExitDTO;
import reactor.core.publisher.Flux;

import java.util.LinkedList;

public interface IProductsReactiveController {

    public Flux<LinkedList<ProductExitDTO>> getProductsByFilters (String category, String brand);

    public Flux<LinkedList<ProductExitDTO>> getProductsToOutOfStock();

    public Flux<LinkedList<ProductExitDTO>> getProductsOutOfStock();

}

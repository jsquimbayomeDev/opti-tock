package com.optistock.products.controllers;

import com.optistock.products.dtos.ProductEntryDTO;
import com.optistock.products.dtos.ProductExitDTO;

import java.util.List;


public interface IProductsController {

    public List<ProductExitDTO> getAllProducts();

    public void createProduct(ProductEntryDTO productDTO);

    public ProductExitDTO updateProduct(ProductEntryDTO productDTO);

    public void deleteProduct(String IdProduct);

}
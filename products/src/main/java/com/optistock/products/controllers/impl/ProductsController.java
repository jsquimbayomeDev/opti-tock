package com.optistock.products.controllers.impl;


import com.optistock.products.controllers.IProductsController;
import com.optistock.products.dtos.ProductEntryDTO;
import com.optistock.products.dtos.ProductExitDTO;
import com.optistock.products.services.IProductsServices;
import lombok.AllArgsConstructor;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("/products")
@AllArgsConstructor
public class ProductsController implements IProductsController {


    @Autowired
    private IProductsServices iProductsServices;


    @Override
    @GetMapping
    public List<ProductExitDTO> getAllProducts() {
        return iProductsServices.getAllProducts();
    }

    @Override
    @PostMapping
    public void createProduct(ProductEntryDTO productDTO) {
        iProductsServices.createProduct(productDTO);
    }


    @Override
    @PutMapping
    public ProductExitDTO updateProduct(ProductEntryDTO productEntryDTO) {
        return iProductsServices.updateProduct(productEntryDTO);
    }

    @Override
    public void deleteProduct(String IdProduct) {
        iProductsServices.deleteProduct(IdProduct);

    }

}


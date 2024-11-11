package com.optistock.products.services;


import com.optistock.products.dtos.ProductEntryDTO;
import com.optistock.products.dtos.ProductExitDTO;

import java.util.List;

public interface IProductsServices {

   public  List<ProductExitDTO> getAllProducts();

   public void createProduct(ProductEntryDTO productEntryDTO);

   public ProductExitDTO updateProduct(ProductEntryDTO productEntryDTO);

   public void deleteProduct(String Id);



}

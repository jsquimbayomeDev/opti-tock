package com.optistock.productsreactive.converters;

import com.optistock.productsreactive.dtos.ProductEntryDTO;
import com.optistock.productsreactive.dtos.ProductExitDTO;
import com.optistock.productsreactive.domain.model.Product;
import org.springframework.stereotype.Component;

@Component
public class ProductConverter {

    public Product ProductEntryDTOtoProduct(ProductEntryDTO ProductEntryDTO) {
        try {
            Product Product = new Product();
            Product.setEmail(ProductEntryDTO.getEmail());
            Product.setProductname(ProductEntryDTO.getProductname());
            Product.setPassword(ProductEntryDTO.getPassword());

            return Product;
        } catch (Exception e) {
            throw new RuntimeException(e);
        }
    }

    public ProductExitDTO ProducttoProductExit(Product Product) {
        ProductExitDTO ProductExitDTO = new ProductExitDTO();
        ProductExitDTO.setId(Product.getId());
        ProductExitDTO.setEmail(Product.getEmail());
        ProductExitDTO.setProductname(Product.getProductname());
        return ProductExitDTO;
    }

}

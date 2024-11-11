package com.optistock.products.converters;



import com.optistock.products.dtos.ProductEntryDTO;
import com.optistock.products.dtos.ProductExitDTO;
import com.optistock.products.models.Product;
import org.springframework.stereotype.Component;

@Component
public class ProductsConverter {

    public Product productsEntryDTOToProduct(ProductEntryDTO productsEntryDTO) {
          try {
              Product product = new Product();
              product.setName(productsEntryDTO.getName());
              product.setCategory(productsEntryDTO.getCategory());
              product.setBrand(productsEntryDTO.getBrand());
              product.setQuantity(productsEntryDTO.getQuantity());
              product.setPrice(productsEntryDTO.getPrice());
              product.setModificationDate(productsEntryDTO.getEntryDate());
              product.setExpirationDate(productsEntryDTO.getExpirationDate());
              product.setStatus(productsEntryDTO.getStatus());
              product.setModificationDate(productsEntryDTO.getModificationDate());
              return product;
          }catch (Exception e) {
              throw new RuntimeException(e);
          }

    }

    public ProductExitDTO productsToProductsExitDTO(Product product) {
        try {
        ProductExitDTO productsExitDTO = new ProductExitDTO();
        productsExitDTO.setName(product.getName());
        productsExitDTO.setCategory(product.getCategory());
        productsExitDTO.setBrand(product.getBrand());
        productsExitDTO.setQuantity(product.getQuantity());
        productsExitDTO.setPrice(product.getPrice());
        productsExitDTO.setModificationDate(product.getEntryDate());
        productsExitDTO.setExpirationDate(product.getExpirationDate());
        productsExitDTO.setStatus(product.getStatus());
        productsExitDTO.setModificationDate(product.getModificationDate());
        return productsExitDTO;
        }catch (Exception e) {
            throw new RuntimeException(e);
        }
    }



}

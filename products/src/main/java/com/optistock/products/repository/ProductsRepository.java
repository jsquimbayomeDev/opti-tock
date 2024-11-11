package com.optistock.products.repository;

import com.optistock.products.models.Product;

import java.util.List;
import java.util.Optional;

public interface ProductsRepository extends BaseMongoRepository<Product, String> {
    @Override
    Optional<Product> findById(String id);

    Optional<Product> findByName(String name);

    List<Product> findAll();

    Optional<Product> findByProductName(String productName);

    default Product findByNameOrException(String name){
        return findByElementOrThrow(findByName(name), "Producto ",name );
    }

    default Product findByIdOrException(String idProduct)
    { return findByElementOrThrow(findById(idProduct), "Producto ",idProduct );}

    default Product saveIfNotExists(Product product) {
        saveIfNotExists(findById(product.getId()), "users", product.getId());
        return save(product);
    }

}

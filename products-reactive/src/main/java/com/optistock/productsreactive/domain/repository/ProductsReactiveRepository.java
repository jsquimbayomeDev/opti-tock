package com.optistock.productsreactive.domain.repository;

import com.optistock.productsreactive.domain.model.Product;
import org.springframework.data.mongodb.repository.ReactiveMongoRepository;
import reactor.core.publisher.Mono;

import java.util.Optional;

public interface ProductsReactiveRepository extends ReactiveMongoRepository<Product, String> {

    Mono<Product> findById(String id);

    Mono<Product> findByProductName(String productName);

}

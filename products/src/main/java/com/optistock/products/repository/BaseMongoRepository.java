package com.optistock.products.repository;

import com.optistock.products.commons.exceptions.AlreadyExistsException;
import com.optistock.products.commons.exceptions.NotFoundException;
import org.springframework.data.mongodb.repository.MongoRepository;

import java.util.Optional;

public interface BaseMongoRepository<T, ID> extends MongoRepository<T, ID> {
    default T findByElementOrThrow(Optional<T> result, String fieldName, String fieldValue) {
        return result.orElseThrow(() -> new NotFoundException("No se encontró el producto " + fieldName + " con el codigo: " + fieldValue));
    }
    default T saveIfNotExists(Optional<T> result, String fieldName, String fieldValue) {
        result.ifPresent(element -> new  AlreadyExistsException("ya existe el producto  " + fieldName + " con el codigo: " + fieldValue));
        return result.orElse(null);
    }
}

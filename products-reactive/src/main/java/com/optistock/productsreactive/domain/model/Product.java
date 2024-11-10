package com.optistock.productsreactive.domain.model;


import lombok.Data;
import org.springframework.data.annotation.Id;
import org.springframework.data.mongodb.core.mapping.Document;

@Data
@Document(collection = "productsreactive")
public class Product {

    @Id
    private String id;
    private String email;
    private String Productname;
    private String password;

}

package com.optistock.products.models;


import lombok.Data;
import org.springframework.data.annotation.Id;
import org.springframework.data.mongodb.core.mapping.Document;

import java.util.Date;


@Data
@Document
public class Product {


    @Id
    public String   id;
    public String   name;
    public String   category;
    public String   brand;
    public Integer  quantity;
    public Float    price;
    public Date     entryDate;
    public Date     expirationDate;
    public String   status;
    public Date     modificationDate;

}

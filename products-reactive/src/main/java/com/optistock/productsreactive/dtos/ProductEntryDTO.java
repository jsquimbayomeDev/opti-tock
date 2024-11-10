package com.optistock.productsreactive.dtos;


import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Data;
import lombok.NoArgsConstructor;

import java.io.Serializable;

@Data
@NoArgsConstructor
@AllArgsConstructor
@Builder
public class ProductEntryDTO implements Serializable {

    public String email;
    public String Productname;
    public String password;

}

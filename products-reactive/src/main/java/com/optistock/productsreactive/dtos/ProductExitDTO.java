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
public class ProductExitDTO implements Serializable {

    public String id;
    public String email;
    public String Productname;

}

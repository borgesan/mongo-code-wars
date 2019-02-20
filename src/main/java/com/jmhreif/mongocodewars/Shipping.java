package com.jmhreif.mongocodewars;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;
import org.springframework.data.mongodb.core.mapping.Document;

@Data
@Document
@NoArgsConstructor
@AllArgsConstructor
public class Shipping {

    private String shippedDate;
    private Integer shipVia;
    private double freight;
    private String shipName, shipAddress, shipCity, shipPostalCode, shipCountry;
}

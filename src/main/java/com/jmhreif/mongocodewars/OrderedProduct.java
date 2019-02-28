package com.jmhreif.mongocodewars;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;
import org.springframework.data.mongodb.core.mapping.Document;

@Data
@Document
@NoArgsConstructor
@AllArgsConstructor
public class OrderedProduct {
    private Integer productId;

    private String productName;
    private double unitPrice;
    private Integer quantityOrdered;
    private double discount;
}

package com.jmhreif.mongocodewars;

import lombok.*;
import org.springframework.data.annotation.Id;
import org.springframework.data.mongodb.core.mapping.Document;

@Data
@Document
@NoArgsConstructor
@AllArgsConstructor
public class OrderCustomer {

    private String customerId;
    private String companyName;
}

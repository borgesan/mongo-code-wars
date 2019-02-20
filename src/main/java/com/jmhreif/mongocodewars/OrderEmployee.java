package com.jmhreif.mongocodewars;

import lombok.*;
import org.springframework.data.mongodb.core.mapping.Document;

@Data
@Document
@NoArgsConstructor
@AllArgsConstructor
public class OrderEmployee {

    private Integer employeeId;
    private String firstName, lastName;
}

package com.example.PortfolioManager.Entity;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;
import org.springframework.data.annotation.Id;
import org.springframework.data.mongodb.core.mapping.Document;
import org.springframework.data.mongodb.core.mapping.Field;

import java.util.Date;

@Data
@AllArgsConstructor
@NoArgsConstructor
@Document(collection = "security")
public class SecurityEntity {
    @Id
    private String securityId;
    @Field("security_name")
    private String securityName;
    @Field("date")
    Date date;
    @Field("price")
    float price;
}

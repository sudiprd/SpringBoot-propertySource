package com.example.propertysource;


import lombok.Getter;
import lombok.Setter;
import org.springframework.boot.context.properties.ConfigurationProperties;
import org.springframework.context.annotation.Configuration;
import org.springframework.context.annotation.PropertySource;

@Getter
@Setter
@PropertySource(value = "classpath:customer.properties")
@ConfigurationProperties(prefix = "customer")
@Configuration

public class Customer {

    private String name;
    private String address;
    private String idNo;



}

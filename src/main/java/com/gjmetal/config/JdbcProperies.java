package com.gjmetal.config;

import lombok.Data;
import org.springframework.boot.context.properties.ConfigurationProperties;
import org.springframework.stereotype.Component;
@ConfigurationProperties(prefix = "jdbc")
@Data
@Component
public class JdbcProperies {
    String url;
    String driverClassName;
    String username;
    String password;

    public static void main(String[] args) {
        System.out.println("111111");

    }
}

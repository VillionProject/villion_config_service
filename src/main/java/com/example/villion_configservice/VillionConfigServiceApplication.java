package com.example.villion_configservice;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.config.server.EnableConfigServer;

@SpringBootApplication
@EnableConfigServer
public class VillionConfigServiceApplication {

    public static void main(String[] args) {
        SpringApplication.run(VillionConfigServiceApplication.class, args);
    }

}

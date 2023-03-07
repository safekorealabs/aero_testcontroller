package com.example.wavve_sdk_example;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

@SpringBootApplication(scanBasePackages = {"com.aerosense","com.example"})
public class WavveSdkExampleApplication {

    public static void main(String[] args) {
        SpringApplication.run(WavveSdkExampleApplication.class, args);
    }

}

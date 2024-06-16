package com.example;

public class App {

    public static void main(String[] args) {
        System.out.println("Hello World!");
        
        // Use the configuration class based on the profile
        Config config = new Config();
        System.out.println(config.getMessage());
    }

}

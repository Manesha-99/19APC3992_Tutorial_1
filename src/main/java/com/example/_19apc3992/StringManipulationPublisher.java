package com.example._19apc3992;

import javax.xml.ws.Endpoint;

public class StringManipulationPublisher {
    public static void main(String[] args) {
        String url = "http://localhost:8080/stringService";
        System.out.println("Publishing StringManipulationService at " + url);
        Endpoint.publish(url, new StringManipulationServiceImpl());
    }
}

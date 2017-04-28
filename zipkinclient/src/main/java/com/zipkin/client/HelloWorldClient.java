package com.zipkin.client;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpHeaders;
import org.springframework.stereotype.Component;
import org.springframework.web.client.RestTemplate;

/**
 * Created by antoine on 28/04/17.
 */
@Component
public class HelloWorldClient {

    @Autowired
    private RestTemplate template;

    private HttpHeaders headers;

    private String server = "http://localhost:8080/hello";

    public HelloWorldClient() {
        this.headers = new HttpHeaders();
        headers.add("Content-Type", "application/json");
        headers.add("Accept", "*/*");
    }

    public String sendHelloWorldRequest() {
        return template.getForObject(server, String.class);
    }

}

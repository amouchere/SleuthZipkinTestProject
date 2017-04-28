package com.zipkin.server;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
class ServerController {
    private static Logger log = LoggerFactory.getLogger(ServerController.class);

    @RequestMapping("/hello")
    public String home() {
        log.info("New Hello world request");
        return "Hello World";
    }
}

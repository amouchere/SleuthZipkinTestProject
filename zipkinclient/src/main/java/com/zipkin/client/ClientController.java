package com.zipkin.client;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

/**
 * Created by antoine on 28/04/17.
 */
@RestController
class ClientController {
    private static Logger log = LoggerFactory.getLogger(ClientController.class);

    @Autowired
    private HelloWorldClient helloWorldClient;

    @RequestMapping("/testzip")
    public String testZipHandler() {

        log.info("New http request");
        final String result = helloWorldClient.sendHelloWorldRequest();
        log.info("Server response: " + result);
        return result;

    }
}


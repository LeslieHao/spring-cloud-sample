package com.hh.spring.cloud.provider2.controller;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

/**
 * @author HaoHao
 * @date 2019-05-20 17:08
 */
@RestController
public class HelloController {

    private final static Logger logger = LoggerFactory.getLogger(HelloController.class);

    @RequestMapping("hello")
    public String sayHello(String name) {
        logger.info("say hello,name:{}", name);
        return "hello " + name + '~';
    }

}

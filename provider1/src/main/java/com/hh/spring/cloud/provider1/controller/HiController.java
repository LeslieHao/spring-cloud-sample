package com.hh.spring.cloud.provider1.controller;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

/**
 * @author HaoHao
 * @date 2019-05-20 17:08
 */
@RestController
public class HiController {

    private final static Logger logger = LoggerFactory.getLogger(HiController.class);

    @RequestMapping("hi")
    public String sayHi(String name) {
        logger.info("say hi,name:{}", name);
        return "hi " + name + '~';
    }

}

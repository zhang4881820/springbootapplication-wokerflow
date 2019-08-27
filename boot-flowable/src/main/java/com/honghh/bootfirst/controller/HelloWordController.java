package com.honghh.bootfirst.controller;

import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

/**
 * ClassName: HelloWordController
 * Description:
 *
 * @author honghh
 * @date 2019/02/19 15:58
 */
@RestController
public class HelloWordController {
    @RequestMapping("/")
    public String index() {
        return "Hello Spring Boot!";
    }
}

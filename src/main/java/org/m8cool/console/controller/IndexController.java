package org.m8cool.console.controller;

import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

/**
 * Created by m8cool on 2017/6/17.
 */
@RestController
public class IndexController {

    @RequestMapping("/")
    public String index(){
        return "Hello World" ;
    }
}

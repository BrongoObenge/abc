package com;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.context.annotation.Bean;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

/**
 * Created by j on 1/16/17.
 */

@RestController
public class Controler {
    @Autowired
    EService service;

    @RequestMapping("/give")
    public String get(E e){
        System.out.println(e);
        service.save(e);
        return "lolthx";
    }
    @Bean
    public EService service(){
        return new EServiceImpl();
    }
}

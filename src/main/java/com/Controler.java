package com;

import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

/**
 * Created by j on 1/16/17.
 */

@RestController
public class Controler {
@RequestMapping("/give")
    public String get(E e){
    System.out.println(e);
    return "lolthx";
}
}

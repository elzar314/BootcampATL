package com.bootcampATLSpring.bootcampATLSpring;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class MainController {

    @GetMapping("/elzar314")
    public String primeraPrueba(){

        return "Hola mundo!";
    }

    @GetMapping("/password")
    public String password(){
        int numero = (int) (Math.random()*100000);
        return "aFcv"+numero+"#$%";
    }

}

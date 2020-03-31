
package com.com470.holaMundoApp.controller;

import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class HolaMundoController {
    
    @RequestMapping(value="/")
    public String hola(){
        return "Hola Mundo";
    }
}

package com.com470.holaMundoApp;

import com.com470.holaMundoApp.model.Persona;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

@SpringBootApplication
public class HolaMundoAppApplication {

    public static void main(String[] args) {
	SpringApplication.run(HolaMundoAppApplication.class, args);
       //primitivos
       int a=5;
       int b=5;
       System.out.println("Primitivo -->" +(a==b));
       //objetos
       Persona personaA=new Persona("Juan","Perez" );
       Persona personaB=new Persona("Juan","Perez" );
       
       System.out.println("objetos-->" +(personaA.equals(personaB)));
    }

}


package com.com470.holaMundoApp.service;

import com.com470.holaMundoApp.model.Persona;

public class UtilidadesPersona {
    private Persona carlos;
    private Persona juan;
    
    public UtilidadesPersona(){
        carlos=new Persona("Carlos","Romero");
        juan=new Persona("Juan","Perez");
    }

    public Persona getCarlos() {
        return carlos;
    }

    public Persona getJuan() {
        return juan;
    }
    
    
}

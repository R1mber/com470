
package com.com470.holaMundoApp.service;


public class Utilidades {
    public String concatenar(String uno, String dos){
        if((uno!=null)&&(dos!=null)){
            return uno.concat(" ").concat(dos);
        }
        return null;
    }
}

package com.com470.holaMundoApp.service;

public class ValidarEmail {

    private static ValidarEmail instance;
    private boolean clean = true;

    private ValidarEmail() {
    }

    public static synchronized ValidarEmail getInstance() {
        if (ValidarEmail.instance == null) {
            instance = new ValidarEmail();
        }
        return ValidarEmail.instance;
    }
    public boolean validaEmail(String email){
        if (!clean) {
            throw new IllegalStateException("El VAlidador esta mal");
        }
        this.clean=false;
        if (!email.contains("@")) {
            return false;
        }
        return true;
    }
    public void reset(){
    if (this.clean) {
            throw new IllegalStateException("Aun no se puede llamar");
        }
    this.clean=true;
    }
}

package com.com470.holaMundoApp.service;

public class Calculadora {
    public int suma(int a,int b){
        return a+b;
    }
    
    public int resta(int a,int b){
        return a-b;
    }
    
    public int multiplicacion(int a, int b){
        return a*b;
    }

    public int divicion(int a,int b){
        if (b!=0){
          return a/b;
        }else{
          throw new IllegalArgumentException();
        }
    }
}

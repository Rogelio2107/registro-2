/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package guia6;

/**
 *
 * @author USUARIO
 */
public class coche {
    private String color;
    private int velocidad;
    private float tamano;
    public static int numeroRuedas = 4;
    
    public static String arrancar(){
        return "el coche arranco";
    }
    
    public static String frenar(){
        return "el coche freno";
    }
    
    public static String girar(){
        return "el coche ejecuto un giro";
    }
    
    public static String combustible(){
        return "el coche cargo combustiblw";
    }
    
    public String getColor(){
        return color;
    }
    
    public void setColor(String color){
        this.color = color;
    }
    public int getVelocidad(){
        return velocidad;
    }
    
    public void setVelocidad(int velocidad){
        this.velocidad= velocidad;
    }
    
    public float getTamano(){
        return tamano;
    }
    
    public void setTamano(float tamano){
        this.tamano = tamano;
    }
}

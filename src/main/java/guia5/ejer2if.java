/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package guia5;

/**
 *
 * @author USUARIO
 */
public class ejer2if {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        int n1,n2;
        System.out.print("Introduce un numero: ");
        n1=Entrada.entero();
        System.out.print("itnroduce otro numero: ");
        n2=Entrada.entero();
        if(n1==n2)
        System.out.print("son iguales");
        else{
        if(n1>n2)
            System.out.println(n1+ " es mayor que " + n2);
        else
            System.out.println(n2 + "es mayor que " + n1);
        }
    }

    private static class Entrada {

        private static int entero() {
            throw new UnsupportedOperationException("Not supported yet.");
        }

        public Entrada() {
        }
    }
    
}

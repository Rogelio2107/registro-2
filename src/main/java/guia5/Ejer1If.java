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
public class Ejer1If {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        int n1,n2;
        System.out.print("introduce un numero: ");
        n1=Entrada.entero();
        System.out.print("introduce otro numero: ");
        n2=Entrada.entero();
        if(n1==n2)
            System.out.println("son iguales");
        else
            System.out.println("no son iguales");
    }

    private static class Entrada {

        private static int entero() {
            throw new UnsupportedOperationException("Not supported yet."); //utilize otro tipo de sintaxis pero con el mismo objetivo
        }

        public Entrada() {
        }
    }
    
}

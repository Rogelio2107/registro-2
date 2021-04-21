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
public class ejerwhile1 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
       int num;
       System.out.print("Introduzca un numero: ");
       num=Entrada.entero();
       while(num!=0)
       {
           if(num>0)
               System.out.print("positivo");
           else
               System.out.println("negativo");
           System.out.println("introduzca otro numero: ");
           num=Entrada.entero();
       }
    }

    private static class Entrada {

        private static int entero() {
            throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
        }

        public Entrada() {
        }
    }
    
}

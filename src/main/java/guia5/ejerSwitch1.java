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
public class ejerSwitch1 {

    public static void main(String[] args) {
     int nota;
     System.out.print("Introduzca una nota: ");
     nota=Entrada.entero();
     switch(nota){
         case 0:
         case 1:
         case 2:
         case 3:
         case 4:
         System.out.println("insuficiente");
         break;
         case 5:
         System.out.println("suficiente");
         break;
         case 6:
             System.out.println("BIEN");
         
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

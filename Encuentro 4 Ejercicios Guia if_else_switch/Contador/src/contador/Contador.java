/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package contador;

/**
 *
 * @author johan
 */
public class Contador {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
   for (int i = 0; i < 1000; i++) {

      String contador = String.format("%03d", i); 

      if (contador.contains("3")) {
        contador = contador.replace("3", "E"); 
      }

      System.out.println(contador); 
    }
  }
}
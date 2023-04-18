/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package javaejercicio2encuentro4;

import java.util.Scanner;

/**
 *
 * @author johan
 */
/*
Definir una variable tipoMotor y permitir que el usuario ingrese un valor
entre 1 y 4. El programa debe mostrar lo siguiente:
o Si el tipo de motor es 1, mostrar un mensaje indicando “La bomba es
una bomba de agua”.
o Si el tipo de motor es 2, mostrar un mensaje indicando “La bomba es
una bomba de gasolina”.
o Si el tipo de motor es 3, mostrar un mensaje indicando “La bomba es
una bomba de hormigón”.
o Si el tipo de motor es 4, mostrar un mensaje indicando “La bomba es
una bomba de pasta alimenticia”.
o Si no se cumple ninguno de los valores anteriores mostrar el mensaje
“No existe un valor válido para tipo de bomba”
*/

public class JavaEjercicio2Encuentro4 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
      Scanner opcion = new Scanner(System.in);
      int tipoMotor;
        System.out.println("Ingresa un numero segun la opcion que quieras elegir");
         System.out.println("--------------------------------");
        System.out.println("1. Bomba de agua");
        System.out.println("2. Bomba de gasolina");
        System.out.println("3. Bomba de hormigon");
        System.out.println("4. Bomba de pasta alimenticia");
        System.out.println("--------------------------------");
        System.out.print(">");
      tipoMotor = opcion.nextInt();
        switch(tipoMotor){
            case 1:
                System.out.println("La bomba es de agua");
                break;
            case 2:
                System.out.println("La bomba es de gasolina");
                break;   
            case 3:
                System.out.println("La bomba es de hormigon");
                break;
            case 4:
                System.out.println("La bomba es de pasta alimenticia");
                break;
            default:
                System.out.println("No existe un valor válido para tipo de bomba");
        }
              
              
      }
          
    }
    


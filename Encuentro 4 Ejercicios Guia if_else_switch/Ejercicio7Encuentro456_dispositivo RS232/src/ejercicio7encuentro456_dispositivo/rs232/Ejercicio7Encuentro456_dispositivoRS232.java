/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package ejercicio7encuentro456_dispositivo.rs232;

import java.util.Scanner;

/**
 *
 * @author johan
 */
public class Ejercicio7Encuentro456_dispositivoRS232 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        Scanner leer = new Scanner(System.in);
        int lecturasCorrectas = 0;
        int lecturasIncorrectas = 0;
        
        while (true) {
            System.out.print("Ingrese una cadena de hasta 5 caracteres (o &&&&& para finalizar): ");
            String cadena = leer.nextLine();
            
            if (cadena.equals("&&&&&")) {
                break;
            }
            
            if (cadena.length() == 5 && cadena.charAt(0) == 'X' && cadena.charAt(4) == 'O') {
                lecturasCorrectas++;
            } else {
                lecturasIncorrectas++;
            }
        }
        
        System.out.println("Lecturas correctas: " + lecturasCorrectas);
        System.out.println("Lecturas incorrectas: " + lecturasIncorrectas);
    }
}


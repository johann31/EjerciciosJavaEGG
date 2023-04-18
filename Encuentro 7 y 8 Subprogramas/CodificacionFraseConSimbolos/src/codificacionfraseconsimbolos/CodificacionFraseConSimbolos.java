/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package codificacionfraseconsimbolos;

import java.util.Scanner;

/**
 *
 * @author johan
 */
public class CodificacionFraseConSimbolos {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        Scanner leer = new Scanner(System.in);
        System.out.print("Ingrese una frase: ");
        String frase = leer.nextLine();
        
        String fraseCodificada = codificarVocales(frase);
        System.out.println("Frase codificada: " + fraseCodificada);
    }
    
    public static String codificarVocales(String frase) {
        String fraseCodificada = "";
        
        for (int i = 0; i < frase.length(); i++) {
            char caracter = frase.charAt(i);
            switch (caracter) {
                case 'a':
                case 'A':
                    fraseCodificada = fraseCodificada.concat("@");
                    break;
                case 'e':
                case 'E':
                    fraseCodificada = fraseCodificada.concat("#");
                    break;
                case 'i':
                case 'I':
                    fraseCodificada = fraseCodificada.concat("$");
                    break;
                case 'o':
                case 'O':
                    fraseCodificada = fraseCodificada.concat("%");
                    break;
                case 'u':
                case 'U':
                    fraseCodificada = fraseCodificada.concat("*");
                    break;
                default:
                    fraseCodificada = fraseCodificada.concat(Character.toString(caracter));
                    break;
            }
        }
        
        return fraseCodificada;
    }
}
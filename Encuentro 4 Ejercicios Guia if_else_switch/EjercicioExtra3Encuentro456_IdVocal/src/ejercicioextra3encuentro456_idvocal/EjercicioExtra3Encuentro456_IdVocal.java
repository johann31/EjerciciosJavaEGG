/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package ejercicioextra3encuentro456_idvocal;
import java.util.Scanner;
/**
 *
 * @author johan
 */
public class EjercicioExtra3Encuentro456_IdVocal {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        Scanner leer = new Scanner(System.in);
        System.out.println("Ingresa una letra, el codigo identificara si es vocal");    
        String letra = leer.nextLine();
        
        if (letra.length()==1) {
            if (letra.equalsIgnoreCase("a") ||
                letra.equalsIgnoreCase("e") || 
                letra.equalsIgnoreCase("i") ||
                letra.equalsIgnoreCase("o") || 
                letra.equalsIgnoreCase("u")){
            System.out.println("La letra ingresada es una vocal");
        }else{
            System.out.println("La letra ingresada no es una vocal");
        } 
        }else {
            System.out.println("Solo debe ingresar una letra");
        }
       
    }
    
}

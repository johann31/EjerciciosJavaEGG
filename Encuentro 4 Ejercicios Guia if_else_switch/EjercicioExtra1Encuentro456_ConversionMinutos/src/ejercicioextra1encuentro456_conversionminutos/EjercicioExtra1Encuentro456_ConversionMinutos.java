/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package ejercicioextra1encuentro456_conversionminutos;
import java.util.Scanner;
/**
 *
 * @author johan
 */
public class EjercicioExtra1Encuentro456_ConversionMinutos {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        Scanner leer = new Scanner(System.in);
        //1dia=24hs
        //24hs*60min=1440min
        //1dia=1440min;
        System.out.println("Ingresa un tiempo en minutos");
        
        int min = leer.nextInt();
        int horas = min/60; //convertimos los minutos ingresados a horas
        int dia = horas/24; //convertimos las horas en dias
        horas = horas % 24; //como el mod de pseint quita el resto de la division

        System.out.println(min + " minutos son " + dia + " días y " + horas + " horas.");
    }
    
}

/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package ejercicio3cambiodemonera;
import java.util.Scanner;
/**
 *
 * @author johan
 */
public class Ejercicio3Cambiodemonera {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        Scanner leer = new Scanner(System.in);
        System.out.println("*1 libras es un 1,14€");
        System.out.println("*1$ es un 0.0043€");
        System.out.println("*1 usd es 0,91€");
        System.out.println("*0.0069 yenes es un 1€");
        System.out.println("Ingrese la cantidad de euros a convertir");
        double euro = leer.nextDouble();
        System.out.println("¿A que moneda desea converit?");
        System.out.println("\n1. Pesos argentinos \n2. Dolares \n3. Libras \n4. Yenes");
        int op = leer.nextInt();
        switch(op){
            case 1:
                double arg = pesos(euro);
                System.out.println("Los " + euro +"€ son:" + "$"+arg);
                break;
            case 2:
                  double usd = dolar(euro);
                System.out.println("Los " + euro +"€ son:" + "u$d"+usd);
                break;
                
                
            case 3:
                   double libra = libras(euro);
                System.out.println("Los " + euro +"€ son:" + "£"+libra);
                break;
                
                
            case 4:
                  double yen = yenes(euro);
                System.out.println("Los " + euro +"€ son:" + "¥"+yen);
                break;
            default: System.out.println("Elige una opcion valida");
                break;
        
        }
    }
    public static double dolar( double euro){
    double usd;
    usd = euro / 0.91;
    return usd;
    }
    public static double pesos( double euro){
    double arg;
    arg = euro / 0.0043;
    return arg;
    }
    public static double yenes( double euro){
    double yen;
    yen = euro / 0.0069;
    return yen;
    }
    public static double libras( double euro){
    double libra;
    libra = euro / 1.14;
    return libra;
    }
}


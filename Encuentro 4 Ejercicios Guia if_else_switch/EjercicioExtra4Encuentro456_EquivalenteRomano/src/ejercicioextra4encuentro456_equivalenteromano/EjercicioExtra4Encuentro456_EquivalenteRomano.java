/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package ejercicioextra4encuentro456_equivalenteromano;
import java.awt.BorderLayout;
import java.util.Scanner;
/**
 *
 * @author johan
 */
public class EjercicioExtra4Encuentro456_EquivalenteRomano {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        Scanner leer = new Scanner(System.in);
        System.out.println("Ingresa un numero entre 1 y 10. El codigo le devolvera el equivalente en romano");
        int num = leer.nextInt();
        if (num>=1 && num<=10) {
          switch (num) {
                case 1:
                       System.out.println(num +"= I");
                    break;
                case 2:
                       System.out.println(num +"= II");
                    break;
                case 3:
                       System.out.println(num +"= III");
                    break;
                case 4:
                       System.out.println(num +"= IV");
                    break;
                case 5:
                       System.out.println(num +"= V");
                    break;
                case 6:
                       System.out.println(num +"= VI");
                    break;
                case 7:
                       System.out.println(num +"= VII");
                    break;
                case 8:
                       System.out.println(num +"= VIII");
                    break;
                case 9:
                       System.out.println(num +"= IX");
                    break;
                case 10:
                       System.out.println(num +"= X");
                    break;
        }
        }else{
            System.out.println("Ingresa un numero valido entre el 1 y 10");
        }
    }
    
}

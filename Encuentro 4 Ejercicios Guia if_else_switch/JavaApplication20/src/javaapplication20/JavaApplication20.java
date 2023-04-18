/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package javaapplication20;

/**
 *
 * @author johan
 */
import java.util.Scanner;

public class JavaApplication20 {
 public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int num1, num2, opcion;
        char confirmacion = 0;

        do {
           
            System.out.print("Por favor, ingrese el primer número entero positivo: ");
            num1 = sc.nextInt();
            System.out.print("Por favor, ingrese el segundo número entero positivo: ");
            num2 = sc.nextInt();
             System.out.println("MENU\n1. SUMAR\n2. RESTAR\n3. MULTIPLICAR\n4. DIVIDIR\n5. SALIR\n");
            System.out.print("Por favor, ingrese una opción: ");
            opcion = sc.nextInt();

            switch (opcion) {
                case 1:
                    int suma = num1 + num2;
                    System.out.println("La suma de los números es: " + suma);
                    break;
                case 2:
                    int resta = num1 - num2;
                    System.out.println("La resta de los números es: " + resta);
                    break;
                case 3:
                    int multiplicacion = num1 * num2;
                    System.out.println("La multiplicación de los números es: " + multiplicacion);
                    break;
                case 4:
                    float division = (float) num1 / num2;
                    System.out.println("La división de los números es: " + division);
                    break;
                case 5:
                    do {
                        System.out.print("¿Está seguro que desea salir del programa (S/N)? ");
                        confirmacion = sc.next().charAt(0);
                        if (confirmacion == 'S' || confirmacion == 's') {
                            System.out.println("Saliendo del programa...");
                            System.exit(0);
                        } else if (confirmacion == 'N' || confirmacion == 'n') {
                            break;
                        }
                        System.out.println("Opción inválida. Por favor, ingrese S o N.");
                    } while (true);
                    break;
                default:
                    System.out.println("Opción inválida. Por favor, ingrese una opción del 1 al 5.");
                    break;
            }

        } while (opcion != 5 || confirmacion == 'N' || confirmacion == 'n');
    }
}
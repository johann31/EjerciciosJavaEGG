/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package ejercicioextra4promedios;

import java.util.Scanner;

/**
 *
 * @author johan
 */
public class EjercicioExtra4Promedios {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
   // Definimos un arreglo bidimensional para guardar las notas de los alumnos
        double[][] notas = new double[10][4];
        // Llamamos a la función para cargar las notas
        cargarNotas(notas);
        // Definimos dos variables para contar la cantidad de aprobados y desaprobados
        int aprobados = 0;
        int desaprobados = 0;
        // Iteramos sobre los alumnos para calcular el promedio y determinar si aprobaron o no
        for (int i = 0; i < notas.length; i++) {
            // Calculamos el promedio de las notas del alumno
            double promedio = (notas[i][0] * 0.1 + notas[i][1] * 0.15 +
                               notas[i][2] * 0.25 + notas[i][3] * 0.5) / 4;
            // Verificamos si el alumno aprobó o no
            if (promedio >= 7) {
                aprobados++;
            } else {
                desaprobados++;
            }
        }
        // Mostramos por pantalla la cantidad de aprobados y desaprobados
        System.out.println("Cantidad de aprobados: " + aprobados);
        System.out.println("Cantidad de desaprobados: " + desaprobados);
    }
    
    public static void cargarNotas(double[][] notas) {
        Scanner sc = new Scanner(System.in);
        // Iteramos sobre los alumnos para cargar sus notas
        for (int i = 0; i < notas.length; i++) {
            System.out.println("Alumno " + (i+1));
            System.out.print("Ingrese la nota del primer trabajo práctico evaluativo: ");
            notas[i][0] = sc.nextDouble();
            System.out.print("Ingrese la nota del segundo trabajo práctico evaluativo: ");
            notas[i][1] = sc.nextDouble();
            System.out.print("Ingrese la nota del primer integrador: ");
            notas[i][2] = sc.nextDouble();
            System.out.print("Ingrese la nota del segundo integrador: ");
            notas[i][3] = sc.nextDouble();
        }
        sc.close();
    }
}

/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package ejercicio1guia7poolibro;

import ejercicio1guia7poolibro.Libro.Libro;
import java.util.Scanner;

/**
 *
 * @author johan
 */
public class Ejercicio1Guia7POOLIBRO {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        Scanner leer = new Scanner(System.in);
        
        Libro miLibro = new Libro();
        
        System.out.print("Ingresa el ISBN: ");
        miLibro.isbn = leer.nextLine();
        System.out.print("Ingresa el Titulo: ");
        miLibro.titulo = leer.nextLine();
        System.out.print("Ingresa el Autor: ");
        miLibro.autor = leer.nextLine();
        System.out.print("Ingresa la cantidad de paginas: ");
        miLibro.paginas = leer.nextLine();
        System.out.println("-------------------------------");
        System.out.println(miLibro);
        System.out.println("-------------------------------");
    }
    
}
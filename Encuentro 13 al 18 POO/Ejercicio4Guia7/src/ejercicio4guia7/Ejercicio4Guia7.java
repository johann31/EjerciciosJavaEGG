/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package ejercicio4guia7;

import ejercicio4guia7.Rectangulo.Rectangulo;

/**
 *
 * @author johan
 */
public class Ejercicio4Guia7 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        Rectangulo miRectangulo = new Rectangulo();
        miRectangulo.crearRectangulo();
        System.out.println("La superficie del rectangulo es: " + miRectangulo.calcularSuperficie());
        System.out.println("El perimetro del rectangulo es: " + miRectangulo.calcularPerimetro());
        miRectangulo.dibujarRectangulo();
    }

   
    
}

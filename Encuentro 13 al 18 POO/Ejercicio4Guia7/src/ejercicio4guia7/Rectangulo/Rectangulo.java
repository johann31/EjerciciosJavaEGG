/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package ejercicio4guia7.Rectangulo;

import java.util.Scanner;

/**
 *
 * @author johan
 */
public class Rectangulo {
    private double base, altura;

    public Rectangulo(int base, int altura) {
        this.base = base;
        this.altura = altura;
    }

    public Rectangulo() {
        this.altura=0;
        this.base=0;
    }

    public int getBase() {
        return (int) base;
    }

    public int getAltura() {
        return (int) altura;
    }

    public void setBase(int base) {
        this.base = base;
    }

    public void setAltura(int altura) {
        this.altura = altura;
    }

    public void crearRectangulo() {
        Scanner leer = new Scanner(System.in);
        System.out.println("Ingrese la base del rectangulo");
        double base=leer.nextDouble();
        System.out.println("Ingrese la altura del rectangulo");
        double altura = leer.nextDouble();
        this.altura=altura;
        this.base=base;
    }
     public double calcularSuperficie(){
        double resultado = base * altura;
        return resultado;
     }
     public double calcularPerimetro(){
     double resultado = (base + altura) * 2;
     return resultado;
     }
     
     public void dibujarRectangulo() {
    for (int i = 1; i <= altura; i++) {
        for (int j = 1; j <= base; j++) {
            if (i == 1 || i == altura || j == 1 || j == base) {//revisa si es la primera o ultima posicion
                System.out.print("*");
            } else {
                System.out.print(" ");
            }
        }
        System.out.println();
    }
}
} 

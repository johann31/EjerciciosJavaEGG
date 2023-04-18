/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package ejercicio3guia7.Operacion;

import java.util.Scanner;

/**
 *
 * @author johan
 */
public class Operacion {
    private int num1,num2;

    public Operacion(int num1, int num2) {
        this.num1 = num1;
        this.num2 = num2;
    }

    public Operacion() {
    }

    public int getNum1() {
        return num1;
    }

    public int getNum2() {
        return num2;
    }

    public void setNum1(int num1) {
        this.num1 = num1;
    }

    public void setNum2(int num2) {
        this.num2 = num2;
    }
    public void crearOperacion() {
    Scanner leer = new Scanner(System.in);
    System.out.print("Ingrese el primer número: ");
    int num1 = leer.nextInt();
    System.out.print("Ingrese el segundo número: ");
    int num2 = leer.nextInt();
    this.num1 = num1;
    this.num2 = num2;
    }
    public int sumar(){
    int resultado = num1 + num2;
    return resultado;
    }
    
     public int restar(){
    int resultado = num1 - num2;
    return resultado;
    }
     public int multiplicar(){
         if (num1 == 0 || num2 == 0) {
         System.out.println("Error: no se puede multiplicar por cero.");
            return 0;
         }else{
             return num1*num2;
         }
     }
     public double dividir() {
    if (num2 == 0) {
        System.out.println("Error: No se puede dividir por cero.");
        return 0;
    } else {
        return (double) num1 / num2;
    }
    }
} 
 

    

/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package javaejercicioguia;

/**
 *
 * @author johan
 */
public class JavaEjercicioGuia {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
       int age = 25;
        double salary = 55000.50;
        boolean isEmployed = true;
        char gender = 'M';
        String name = "Juan";
        long phoneNumber = 1234567890L;
        
        System.out.println("Mi nombre es " + name + " y tengo " + age + " años.");
        System.out.println("Mi salario es " + salary + " y mi numero de telefono es " + phoneNumber + ".");
        System.out.println("Soy " + (isEmployed ? "empleado" : "desempleado") + " y mi genero es " + gender + ".");
    }
}
/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package pooeje1;

import Entidad.Persona;

/**
 *
 * @author johan
 */
public class POOEje1 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        Persona primeraPersona = new Persona();
        Persona segundaPersona = new Persona("Mariano", 30 , 002);
        
        primeraPersona.setNombre("Juan");
        primeraPersona.setEdad(35);
        primeraPersona.setId(001);
        System.out.println("Nombre= "+ primeraPersona.getNombre());
        System.out.println("Edad= "+ primeraPersona.getEdad());
        System.out.println("Id= "+ primeraPersona.getId());
        
        System.out.println("");
        System.out.println("SEGUNDA PERSONA");
        System.out.println("Nombre= " + segundaPersona.getNombre());
        System.out.println("Edad= " + segundaPersona.getEdad());
        System.out.println("Id= " + segundaPersona.getId());
    }
    
}

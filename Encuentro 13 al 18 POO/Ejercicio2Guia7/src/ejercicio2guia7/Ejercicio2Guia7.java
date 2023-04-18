package ejercicio2guia7;

import ejercicio2guia7.Circuferencia.Circunferencia;

/**
 *
 * @author johan
 */
public class Ejercicio2Guia7 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        Circunferencia miCircunferencia = new Circunferencia(); // crea una instancia de Circunferencia
        miCircunferencia.crearCircunferencia(); // llama al método para establecer el valor del radio
        double area = miCircunferencia.Area(); // llama al método para obtener el área
        double perimetro = miCircunferencia.Perimetro(); // llama al método para obtener el perímetro
        System.out.println("El perímetro de la circunferencia es: " + perimetro);
        System.out.println("El área de la circunferencia es: " + area);
    }
}

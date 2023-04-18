package ejercicio2guia7.Circuferencia;

import java.util.Scanner;

/**
 *
 * @author johan
 */
public class Circunferencia {
    private double radio;
    
    public double Area() {
        return Math.PI * Math.pow(radio, 2);
    }
    
    public double Perimetro(){
        return 2 * Math.PI * radio;
    }

    public Circunferencia() {
        this.radio = 0;
    }

    public double getRadio() {
        return radio;
    }

    public void setRadio(double radio) {
        this.radio = radio;
    }
    
    public void crearCircunferencia(){
        Scanner leer = new Scanner(System.in);
        System.out.print("Ingrese el valor del radio: ");
        double radio = leer.nextDouble();
        this.radio = radio;
    }
}

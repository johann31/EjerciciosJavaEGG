/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package ejercicioextra2variableaux;

import com.sun.xml.internal.bind.v2.runtime.output.SAXOutput;

/**
 *
 * @author johan
 */
public class EjercicioExtra2VariableAux {

    /**
     * @param args the command line arguments
     *  B tome el valor de C
     *  C tome el valor de A
     *  A tome el valor de D
     *  D tome el valor de B
     */
    public static void main(String[] args) {
        // TODO code application logic here
        int A=4, B=10, C=90, D=43, aux=0;
        System.out.println( "A = " + A);
        System.out.println( "B = " + B);
        System.out.println( "C = " + C);
        System.out.println( "D = " + D);
        aux=B;
        B=C;
        C=A;
        A=D;
        D=aux;
        System.out.println("--------------------------");
        System.out.println("B tome el valor de C");
        System.out.println("C tome el valor de A");
        System.out.println("A tome el valor de D"); 
        System.out.println("D tome el valor de B");
        System.out.println("--------------------------");
        System.out.println( "A = " + A);
        System.out.println( "B = " + B);
        System.out.println( "C = " + C);
        System.out.println( "D = " + D);
    }
    
}

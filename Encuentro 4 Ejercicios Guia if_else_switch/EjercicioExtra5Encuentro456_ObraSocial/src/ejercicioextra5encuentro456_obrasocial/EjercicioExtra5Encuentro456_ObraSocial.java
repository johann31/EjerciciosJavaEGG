/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package ejercicioextra5encuentro456_obrasocial;
import com.sun.xml.internal.bind.v2.runtime.reflect.opt.Const;
import java.util.Scanner;
import jdk.nashorn.internal.ir.ContinueNode;
/**
 *
 * @author johan
 */
public class EjercicioExtra5Encuentro456_ObraSocial {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        Scanner leer = new Scanner(System.in);
        System.out.println("Elige una categoria\n1. Categoria A\n2. Categoria B\n3. Categoria C\n4 Salir");
        String letra = leer.nextLine();
        double desc;
        switch(letra) {
            case "A":
            case "a":
                System.out.println("La cuota mensual a pagar es $4500");
                System.out.println("Por ser Categoria A tienes un 50% de descuento en todo tipos de tratamientos");
                System.out.println("Desea ver los tratamientos disponibles");
                System.out.println("S = Si / N = NO");
                letra = leer.nextLine().toUpperCase();
                
                if(letra.equals("S")){
                    System.out.println("Lista de tratamientos disponibles");
                    System.out.println("\n1. Consultas médicas generales \n2. Tratamientos odontológicos \n3. Tratamientos psicológicos");
                    int op = leer.nextInt();
                    switch(op){
                        case 1:
                            
                             System.out.println("CONSULTAS MEDICAS GENERALES");
                             System.out.println("");
                             System.out.println("Esto incluye(sin descuentos):");    
                             System.out.println("\n1. Chequeos de salud $6000" +   "\n2. Exámenes médicos $7500" + " \n3. Diagnósticos $4500" + "\n4. Prescripción de medicamentos $2000");
                             System.out.println("");
                             System.out.println("PRECIOS CON DESCUENTO");
                             System.out.println("\n1. Chequeos de salud: $"+ (6000-6000*0.50) +   "\n2. Exámenes médicos $"+(7500-7500*0.50) + " \n3. Diagnósticos $"+(4500-4500*0.50) + "\n4. Prescripción de medicamentos $"+(2000-2000*0.50));
                             
                             break;
                        case 2:
                            System.out.println("TRATAMIENTOS ODONTOLÓGICOS");
                            System.out.println("Esto incluye (sin descuentos): \n1. Limpieza dental o profilaxis: $3.500 \n2" +
                                               "Blanqueamiento dental:  $12.000\n3" +"Carillas dentales: $30.000 por diente\n4" +
                                               "Coronas dentales: $40,000 por diente\n5" + "Implantes dentales: $70.000 por diente\n6" +
                                               "Ortodoncia: $125.000\n7" + "Endodoncia: $15.000 por diente\n8" + "Extracción dental: $6.500 por diente\n9" +
                                               "Tratamiento de conducto: $14.500 por diente\n10" +"Restauraciones dentales (empastes, incrustaciones, etc.): entre $7.000 por diente");
                            System.out.println("");
                            System.out.println("PRECIOS CON DESCUENTO"); 
                            System.out.println (" \n1. Limpieza dental o profilaxis: $" + (3500-3500*.50) + "\n2. Blanqueamiento dental: $" + (12000-12000*.50) + "\n3. Carillas dentales: $" + (30000-30000*.50) + "por diente " + "\n4. Coronas dentales: $" + (40000-40000*.50) + "por diente" + "\n5. Implantes dentales: $" +(70000-70000*.50) + "por diente" + "\n6. Ortodoncia: $" + (125000-125000*.50) + "\n7. Endodoncia: $" + (15000-15000*.50) + "por diente" + "\n8. Extracción dental: $"+  (6500-6500*.50) + "por diente" + "\n9. Tratamiento de conducto: $" + (14500-14500*.50) + "por diente" + "\n10. Restauraciones dentales (empastes, incrustaciones, etc.): $" + (7000-7000*.50) + " por diente");
                            break;
                        case 3:
                            System.out.println("TRATAMIENTOS PSICOLÓGICOS");
                            System.out.println("Esto incluye (sin descuentos): \n1. Sesión de terapia individual: $2.500 por sesión (generalmente 50-60 minutos)\n" +
"\n2. Sesión de terapia de pareja o familiar: $3.500 por sesión (generalmente 60-90 minutos)" +
"\n3 Evaluación psicológica: $5.500 (dependiendo de la duración y complejidad)" +
"\n4. Tratamiento de trastornos de ansiedad: $20.000 (dependiendo de la duración y la gravedad del trastorno)" +
"\n5. Tratamiento de trastornos del estado de ánimo: $20.000 (dependiendo de la duración y la gravedad del trastorno)" +
"\n6. Tratamiento de trastornos alimentarios: $28.000 (dependiendo de la duración y la gravedad del trastorno)" +
"\n7. Tratamiento de adicciones: $30.000 (dependiendo del tipo y la duración del tratamiento)" +
"\n8. Terapia de grupo: $3.000 por sesión (generalmente 60-90 minutos)");
                            System.out.println("");
                            System.out.println("PRECIOS CON DESCUENTO"); 
                            System.out.println("\n1. Sesión de terapia individual: $2.500 por sesión" +
"\n2. Sesión de terapia de pareja o familiar: $" + (3500-3500*.50) + " por sesión" +
"\n3 Evaluación psicológica $:" + (5500-5500*.50) +
"\n4. Tratamiento de trastornos de ansiedad: $" + (20000-20000*.50) +
"\n5. Tratamiento de trastornos del estado de ánimo: $20.000 " +
"\n6. Tratamiento de trastornos alimentarios: $" + (28000-28000*.50) +
"\n7. Tratamiento de adicciones: $" + (30000-30000*.50) +
"\n8. Terapia de grupo: $" + (3000-3000*.50) + "por sesión");
                            break;
                    }
                } else{ 
                     break;
                        }
                break;
            case "B":
            case "b":
                System.out.println("La cuota mensual a pagar es $3000");
                System.out.println("Por ser Categoria B tienes un 35% de descuento en todo tipos de tratamientos");
                System.out.println("Desea ver los tratamientos disponibles");
                System.out.println("S = Si / N = NO");
                letra = leer.nextLine().toUpperCase();
                if(letra.equals("S")){
                    System.out.println("Lista de tratamientos disponibles");
                    System.out.println("\n1. Consultas médicas generales \n2. Tratamientos odontológicos \n3. Tratamientos psicológicos");
                    int op = leer.nextInt();
                    switch(op){
                        case 1:
                             System.out.println("CONSULTAS MEDICAS GENERALES");
                             System.out.println("");
                             System.out.println("Esto incluye(sin descuentos):");    
                             System.out.println("\n1. Chequeos de salud $6000" +   "\n2. Exámenes médicos $7500" + " \n3. Diagnósticos $4500" + "\n4. Prescripción de medicamentos $2000");
                             System.out.println("");
                             System.out.println("PRECIOS CON DESCUENTO");
                             System.out.println("\n1. Chequeos de salud: $"+ (6000-6000*.35) +   "\n2. Exámenes médicos $"+(7500-7500*.35) + " \n3. Diagnósticos $"+(4500-4500*.35) + "\n4. Prescripción de medicamentos $"+(2000-2000*.35));
                             break;
                        case 2:
                            System.out.println("TRATAMIENTOS ODONTOLÓGICOS");
                            System.out.println("Esto incluye (sin descuentos): \n1. Limpieza dental o profilaxis: $3.500 \n2" +
                                               "Blanqueamiento dental:  $12.000\n3" +"Carillas dentales: $30.000 por diente\n4" +
                                               "Coronas dentales: $40,000 por diente\n5" + "Implantes dentales: $70.000 por diente\n6" +
                                               "Ortodoncia: $125.000\n7" + "Endodoncia: $15.000 por diente\n8" + "Extracción dental: $6.500 por diente\n9" +
                                               "Tratamiento de conducto: $14.500 por diente\n10" +"Restauraciones dentales (empastes, incrustaciones, etc.): entre $7.000 por diente");
                            System.out.println("");
                            System.out.println("PRECIOS CON DESCUENTO"); 
                            System.out.println (" \n1. Limpieza dental o profilaxis: $" + (3500-3500*.35) + "\n2. Blanqueamiento dental: $" + (12000-12000*.35) + "\n3. Carillas dentales: $" + (30000-30000*.35) + "por diente " + "\n4. Coronas dentales: $" + (40000-40000*.35) + "por diente" + "\n5. Implantes dentales: $" +(70000-70000*.35) + "por diente" + "\n6. Ortodoncia: $" + (125000-125000*.35) + "\n7. Endodoncia: $" + (15000-15000*.35) + "por diente" + "\n8. Extracción dental: $"+  (6500-6500*.35) + "por diente" + "\n9. Tratamiento de conducto: $" + (14500-14500*.35) + "por diente" + "\n10. Restauraciones dentales (empastes, incrustaciones, etc.): $" + (7000-7000*.35) + " por diente");
                            break;
                        case 3:
                            System.out.println("TRATAMIENTOS PSICOLÓGICOS");
                            System.out.println("Esto incluye (sin descuentos): \n1. Sesión de terapia individual: $2.500 por sesión (generalmente 50-60 minutos)\n" +
"\n2. Sesión de terapia de pareja o familiar: $3.500 por sesión (generalmente 60-90 minutos)" +
"\n3 Evaluación psicológica: $5.500 (dependiendo de la duración y complejidad)" +
"\n4. Tratamiento de trastornos de ansiedad: $20.000 (dependiendo de la duración y la gravedad del trastorno)" +
"\n5. Tratamiento de trastornos del estado de ánimo: $20.000 (dependiendo de la duración y la gravedad del trastorno)" +
"\n6. Tratamiento de trastornos alimentarios: $28.000 (dependiendo de la duración y la gravedad del trastorno)" +
"\n7. Tratamiento de adicciones: $30.000 (dependiendo del tipo y la duración del tratamiento)" +
"\n8. Terapia de grupo: $3.000 por sesión (generalmente 60-90 minutos)");
                            System.out.println("");
                            System.out.println("PRECIOS CON DESCUENTO"); 
                            System.out.println("\n1. Sesión de terapia individual: $2.500 por sesión" +
"\n2. Sesión de terapia de pareja o familiar: $" + (3500-3500*.35) + " por sesión" +
"\n3 Evaluación psicológica $:" + (5500-5500*.35) +
"\n4. Tratamiento de trastornos de ansiedad: $" + (20000-20000*.35) +
"\n5. Tratamiento de trastornos del estado de ánimo: $" + (20000-20000*.35) +
"\n6. Tratamiento de trastornos alimentarios: $" + (28000-28000*.35) +
"\n7. Tratamiento de adicciones: $" + (30000-30000*.35) +
"\n8. Terapia de grupo: $" + (3000-3000*.35) + "por sesión");
                            break;
                    }
                } else{ 
                     break;
                        }
            case "C":
            case "c":
                System.out.println("La cuota mensual a pagar es $2500");
                System.out.println("No tienes descuentos disponibles en ningun tratamiento");
                System.out.println("Desea ver los tratamientos disponibles");
                System.out.println("S = Si / N = NO");
                 letra = leer.nextLine().toUpperCase();
                
                if(letra.equals("S")){
                    System.out.println("Lista de tratamientos disponibles");
                    System.out.println("\n1. Consultas médicas generales \n2. Tratamientos odontológicos \n3. Tratamientos psicológicos");
                    int op = leer.nextInt();
                    switch(op){
                        case 1:
                            
                             System.out.println("CONSULTAS MEDICAS GENERALES");
                             System.out.println("");
                             System.out.println("Esto incluye(sin descuentos):");    
                             System.out.println("\n1. Chequeos de salud $6000" +   "\n2. Exámenes médicos $7500" + " \n3. Diagnósticos $4500" + "\n4. Prescripción de medicamentos $2000");
                           
                             break;
                        case 2:
                            System.out.println("TRATAMIENTOS ODONTOLÓGICOS");
                            System.out.println("Esto incluye (sin descuentos): "
                                    + "\n1. Limpieza dental o profilaxis: $3.500"
                                    + "\n2. Blanqueamiento dental:  $12.000"
                                    + "\n3. Carillas dentales: $30.000 por diente"
                                    + "\n4. Coronas dentales: $40,000 por diente"
                                    + "\n5. Implantes dentales: $70.000 por diente"
                                    + "\n6. Ortodoncia: $125.000"
                                    + "\n7. Endodoncia: $15.000 por diente"
                                    + "\n8. Extracción dental: $6.500 por diente"
                                    + "\n9. Tratamiento de conducto: $14.500 por diente"
                                    + "\n10. Restauraciones dentales (empastes, incrustaciones, etc.): entre $7.000 por diente");
                          break;
                        case 3:
                            System.out.println("TRATAMIENTOS PSICOLÓGICOS");
                            System.out.println("Esto incluye (sin descuentos): \n1. Sesión de terapia individual: $2.500 por sesión (generalmente 50-60 minutos)\n" +
"\n2. Sesión de terapia de pareja o familiar: $3.500 por sesión (generalmente 60-90 minutos)" +
"\n3 Evaluación psicológica: $5.500 (dependiendo de la duración y complejidad)" +
"\n4. Tratamiento de trastornos de ansiedad: $20.000 (dependiendo de la duración y la gravedad del trastorno)" +
"\n5. Tratamiento de trastornos del estado de ánimo: $20.000 (dependiendo de la duración y la gravedad del trastorno)" +
"\n6. Tratamiento de trastornos alimentarios: $28.000 (dependiendo de la duración y la gravedad del trastorno)" +
"\n7. Tratamiento de adicciones: $30.000 (dependiendo del tipo y la duración del tratamiento)" +
"\n8. Terapia de grupo: $3.000 por sesión (generalmente 60-90 minutos)");
                            break;
                    }
                } else{ 
                     break;
                        }
                break;
        }
    }
    
}

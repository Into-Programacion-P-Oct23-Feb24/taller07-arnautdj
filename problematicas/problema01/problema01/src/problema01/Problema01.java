/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package problema01;

import java.util.Locale;
import java.util.Scanner;

/**
 *
 * @author LAB.ELECT
 */
public class Problema01 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        Scanner entrada = new Scanner(System.in);
        entrada.useLocale(Locale.US);
        
        String cadenaReporte = "";
        String nombreJugador;
        String posicionCampo;
        double estatura;
        int edad;
        boolean bandera = true;
        String salir;
        int sumaEdades = 0;
        double sumaEstaturas = 0;
        int contadorIteraciones = 0;
        double promedioEdad;
        double promedioEstatura;
        String edadAcumulacion = "";
        cadenaReporte = String.format("%s%s\n", cadenaReporte, 
                "Listado de Jugadores");
        
        do {
            System.out.println("Ingrese el nombre del Jugador: ");
            nombreJugador = entrada.nextLine();
            System.out.println("Ingrese la posición en el campo: ");
            posicionCampo = entrada.nextLine();
            System.out.println("Ingrese la edad del Jugador: ");
            edad = entrada.nextInt();
            System.out.println("Ingrese la estatura del Jugador: ");
            estatura = entrada.nextDouble();

            sumaEdades = sumaEdades + edad;
            sumaEstaturas = sumaEstaturas + estatura;
            
            edadAcumulacion = edadAcumulacion + edad + "\n";

            contadorIteraciones = contadorIteraciones + 1; 

            cadenaReporte = String.format("%s%d. %s -%s-, edad %d, "
                    + "%.2f\n",
                    cadenaReporte,
                    contadorIteraciones,
                    nombreJugador,
                    posicionCampo,
                    edad,
                    estatura);
            
            entrada.nextLine(); 
            System.out.println("Sigite (s), si desea terminar");
            salir = entrada.nextLine();
            if(salir.equals("s")){
                bandera = false;
            }
        } while (bandera);
        
        promedioEdad = (double)sumaEdades/contadorIteraciones;
        promedioEstatura = sumaEstaturas/contadorIteraciones;

        cadenaReporte = String.format("%sListado de Edades\n%sPromedio de edades: %.2f\n"
                +"Promedio de estaturas: %.2f", 
                cadenaReporte, edadAcumulacion,  promedioEdad, promedioEstatura);
 
        System.out.printf("%s\n", cadenaReporte);
       
    }
    
}

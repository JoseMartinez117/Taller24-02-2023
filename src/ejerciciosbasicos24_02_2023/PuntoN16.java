/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package ejerciciosbasicos24_02_2023;

import java.util.Scanner;

/**
 *
 * @author josem
 */
public class PuntoN16 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        Scanner teclado = new Scanner(System.in);
        double d=0, v1=0, v2=0, tiempo=0;
        
        System.out.println("Que distancia hay entre los 2 vehiculos? ");
        d=teclado.nextDouble();
      
        
            System.out.println("Ingrese la velocidad de los 2 vehiculos en Km/h");
            System.out.print("A: ");
            v1=teclado.nextDouble(); 
            System.out.print("B: ");
            v2=teclado.nextDouble();
            
            
            if(v1==v2){
                System.out.println("Los vehiculos se mantendran a la misma distancia ya que sus velocidades son iguales");
            
            }else if(v2<v1){
                System.out.println("\nEl vehiculo A  es el que tiene mas velocidad" );
                tiempo=v1/d;
                tiempo=tiempo*60;
                Math.round(tiempo);
                
                System.out.println("\nEl vehiculo A con la velocidad de "+v1+" tardara "+tiempo+" minutos en alcanzar al vehiculo B");
                
            }else if(v2>v1){
                System.out.println("\nEl vehiculo B  es el que tiene mas velocidad" );
                tiempo=v2/d;
                tiempo=tiempo*60;
                Math.round(tiempo);
                
                System.out.println("\nEl vehiculo B con la velocidad de "+v1+" tardara "+tiempo+" minutos en alcanzar al vehiculo A");            
            }
      
        
        
        
    }
    
}

/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package ejerciciosbasicos24_02_2023;

import java.util.Scanner;

/**
 *
 * @author LabSispc13
 */
public class PuntoN10 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        Scanner teclado = new Scanner(System.in);
        double parcial1=0, parcial2=0, parcial3=0, examen=0, Pfinal=0, totalP=0, total=0;
        
        System.out.println("Ingres las notas de los 3 primeros parciales: ");
        System.out.print("#1: ");
        parcial1=teclado.nextDouble();
        System.out.print("#2: ");
        parcial2=teclado.nextDouble();
        System.out.print("#3: ");
        parcial3=teclado.nextDouble();
        
        System.out.print("\nIngrese la nota del examen final: ");
        examen=teclado.nextDouble();
        
        System.out.print("\nIngrese la nota del proyecto final: ");
        Pfinal=teclado.nextDouble();
        
        
        
        totalP=((parcial1+parcial2+parcial3)/3)*0.55;
        examen=examen*0.30;
        Pfinal=Pfinal*0.15;
        total=totalP+examen+Pfinal;
                
        System.out.println("\nLa nota final sera: "+total);
        
        
        
    }
    
}

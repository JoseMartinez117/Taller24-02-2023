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
public class PuntoN12 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        Scanner teclado = new Scanner(System.in);
        float x=0, x1=0, y=0, y1=0, m=0;
        
        System.out.println("Ingrese los primeros pares de numeros");
        System.out.print("x: ");
        x=teclado.nextFloat();
        System.out.print("x1: ");
        x1=teclado.nextFloat();
        
        System.out.println("Ingrese los segundos pares de numeros");
        System.out.print("y: ");
        y=teclado.nextFloat();
        System.out.print("y1: ");
        y1=teclado.nextFloat();
        
        m=(y1-y)/(x1-x);
        
        System.out.println("La distancia entre las dos coordenadas en el plano es: "+m);
        
        
        
    }
    
}

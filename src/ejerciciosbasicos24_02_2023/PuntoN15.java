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
public class PuntoN15 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
       Scanner teclado = new Scanner(System.in);
       float x=0, y=0, aux=0;
       
        System.out.println("Ingrese 2 numeros");
        System.out.print("#A: ");
        x=teclado.nextFloat();
        System.out.print("#B: ");
        y=teclado.nextFloat();
        
        aux=x;
        x=y;
        y=aux;
        
        System.out.println("Se han intercambiados los valores de A y B");
        System.out.println("A: "+x);
        System.out.println("B: "+y);
       
    }
    
}

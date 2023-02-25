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
public class PuntoN9 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        Scanner teclado = new Scanner(System.in);
        double total=0;
        
        System.out.print("Ingrese el total a pagar ");
        total=teclado.nextDouble();
        
        total=total-(total*0.15);
        
        System.out.println("\n El total a pagar junto con el descuento es "+total);

        
        
        
        
        
        
        
        
    }
    
}

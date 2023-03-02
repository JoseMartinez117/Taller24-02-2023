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
public class PuntoN3 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        Scanner teclado= new Scanner(System.in);
        double a=0, b=0, h=0;
        
        System.out.println("Ingrese los catetos para hayar la hipotenusa");
        System.out.print("A: ");
        a=teclado.nextDouble();
        System.out.print("B: ");
        b=teclado.nextDouble();
        
        h=Math.sqrt(Math.pow(a, 2)+Math.pow(b, 2));
        
        System.out.println("La hipotenusa es "+h);
        
    }
    
}

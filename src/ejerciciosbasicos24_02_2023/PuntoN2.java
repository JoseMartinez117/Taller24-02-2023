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
public class PuntoN2 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        Scanner teclado= new Scanner(System.in);
        double b=0, h=0, area=0;
        
        System.out.println("Digite la altura y la base del triangulo para calcular el area");
        System.out.print("Base: ");
        b=teclado.nextDouble();
        System.out.print("Altura: ");
        h=teclado.nextDouble();
        
        area=(b*h)/2;
        
        System.out.println("El area del triangulo es "+area);
    }
    
}

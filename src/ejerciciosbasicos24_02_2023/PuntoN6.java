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
public class PuntoN6 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
    Scanner teclado = new Scanner(System.in);   
    double num=0, num1=0, num2=0, media=0;

    System.out.println("\nPara calcular la media neceisto que igrese 3 numeros");
        System.out.print("#1: ");
        num=teclado.nextDouble();
        System.out.print("#2: ");
        num1=teclado.nextDouble();
        System.out.print("#3: ");
        num2=teclado.nextDouble();
        
        media=(num+num1+num2)/3;
        
        System.out.println("La media es: "+media);
    }
    
}

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
public class PuntoN5 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        Scanner teclado= new Scanner(System.in);
        double f=0, c=0;
        
        System.out.println("Ingrese los grados Fahrenheit para hacer conversion a celsius");
        f=teclado.nextDouble();
        
        c=((f-32)*5)/9;
        
        System.out.println("La temperatura "+f+" en celsius es: "+c);
        
        
        
        
        
    }
    
}

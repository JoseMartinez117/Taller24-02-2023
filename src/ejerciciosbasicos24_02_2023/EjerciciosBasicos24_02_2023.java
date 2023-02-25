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
public class EjerciciosBasicos24_02_2023 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        Scanner teclado = new Scanner(System.in);
        float sueldo=0, venta1=0, venta2=0, venta3;
        
        System.out.print("Ingrese el sueldo que su merce gana: ");
        sueldo=teclado.nextFloat();
        
        System.out.println("Ingrese el valor de las ventas: ");
        System.out.print("#1: ");
        venta1=teclado.nextFloat();
        System.out.print("#2: ");
        venta2=teclado.nextFloat();
        System.out.print("#3: ");
        venta3=teclado.nextFloat();
        
        sueldo=sueldo+((venta1+venta2+venta3)/10);
        System.out.println("EL sueldo a final de mes sera: "+sueldo);
        
        
        
        
        
        
        
        
        
        
        
        
        
        
    }
    
}

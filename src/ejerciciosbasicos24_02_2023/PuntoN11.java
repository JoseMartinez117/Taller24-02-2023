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
public class PuntoN11 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
       Scanner teclado = new Scanner(System.in);
       int x=0, y=0, d=0;
       
        System.out.println("Ingrese los 2 numeros: ");
        System.out.print("#1: ");
        x=teclado.nextInt();
        System.out.print("#2: ");
        y=teclado.nextInt();
       
        d=(x-y);
        if(d<0){
        d=d*-1;
        }
        
        System.out.println("Existen "+d+" de numeros de distancia entre "+x+" y "+y);
        
        
        
    }
    
}

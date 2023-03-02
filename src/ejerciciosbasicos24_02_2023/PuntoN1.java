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
public class PuntoN1 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
       Scanner teclado= new Scanner(System.in);
       String nombre="";
       
        System.out.println("Ingresa tu nombre");
        nombre=teclado.next();
        
        System.out.println("Hola "+nombre+" que tal el dia?");
       
       
    }
    
}

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
public class PuntoN18 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        Scanner teclado = new Scanner(System.in);
        String nombre, nombre2, apellido, apellido2;
        
        System.out.println("Por favor digite");
        System.out.print("Primer Nombre: ");
        nombre=teclado.next();
        System.out.print("Segundo Nombre: ");
        nombre2=teclado.next();
        System.out.print("Primer Apellido: ");
        apellido=teclado.next();
        System.out.print("Segundo Apellido: ");
        apellido2=teclado.next();
        
        System.out.println("\nLas iniciales son: ");
        System.out.println(nombre.charAt(0));
        System.out.println(nombre2.charAt(0));
        System.out.println(apellido.charAt(0));
        System.out.println(apellido2.charAt(0));
        
        
    }
    
}

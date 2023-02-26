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
public class Punto13 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        Scanner teclado = new Scanner(System.in);
        double numero=0, resultado=0, resultado2=0;
        
        System.out.println("Ingrese un numero para calcularle la raiz cuadrada y cubica");
        numero=teclado.nextDouble();
        
        resultado= Math.sqrt(numero);
        resultado2=Math.pow(numero, 1/3);
        
        System.out.printf("La raiz cuadrada de "+numero+" es %.3f", resultado);
        System.out.println("\nLa raiz cubica de "+numero+" es "+resultado2);
        
        
        
        
    }
    
}

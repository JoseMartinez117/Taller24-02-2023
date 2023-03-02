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
public class PuntoN4 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        Scanner teclado= new Scanner(System.in);
        double a=0, b=0, suma=0, resta=0, mult=0, divi=0;
        
        System.out.println("Digite los dos numeros a los cuales se les aplicara las diferentes operaciones aritmeticas");
        System.out.print("A: ");
        a=teclado.nextDouble();
        System.out.print("B: ");
        b=teclado.nextDouble();
        
        suma=a+b;
        resta=a-b;
        mult=a*b;
        System.out.println("El resultado de la suma es: "+suma);
        System.out.println("El resultado de la resta es: "+resta);
        System.out.println("El resultado de la multiplicacion es: "+mult);
        
        
        if(b!=0){
        divi=a/b;
            System.out.println("el resultado de la division es: "+divi);
        }else{
            System.out.println("MathError");
        }
           
        
    }
    
}

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
public class PuntoN19 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        Scanner teclado = new Scanner(System.in);
        
        int cantidad=0, correcto=0, incorrecto=0, nrespondio=0, comparador=0, total=0;
        
        System.out.println("Ingrese el total de preguntas");
        cantidad=teclado.nextInt();
        System.out.println("Cuantas respuestas fueron correctas?");
        correcto=teclado.nextInt();
        System.out.println("Cuantas respuestas fueron incorrectas?");
        incorrecto=teclado.nextInt();
        System.out.println("Cuantas respuestas no fueron contestadas?");
        nrespondio=teclado.nextInt();
        
        comparador=correcto+incorrecto+nrespondio;
        
        if(cantidad==comparador){
            
            total=correcto*5;
            total=total-incorrecto;
            
            System.out.println("\nLa nota final es: "+total);
        
        }else{
            System.out.println("\nDigito de manera incorrecta las cantidades");
        }
    }
    
}

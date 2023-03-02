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
public class PuntoN7 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        Scanner teclado = new Scanner(System.in);
        int minuto=0, hora=0;
        
        System.out.println("\nPara convertir los minutos a horas ingresa los minutos");
        System.out.println("Ingresar los minutos");
        minuto=teclado.nextInt();
        hora=minuto/60;
        minuto=minuto%60;
        
        System.out.println("La hora es: "+hora+" con "+minuto+" minutos");
        
    }
    
}

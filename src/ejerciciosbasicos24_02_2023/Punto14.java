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
public class Punto14 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        Scanner teclado = new Scanner(System.in);
        String numero="", oremun="";
        int invertir=0;
        
        System.out.println("Ingrese el numero a invertir");
        numero=teclado.next();
        
        if(numero.length()!=1){
            invertir=numero.length()-1;
            
          for(int i=invertir; i>=0; i--){
           oremun+=numero.charAt(i);
           }
           System.out.println("El numero invertido es "+oremun);
        }else{
            System.out.println("Para realizar el proceso, el numero tiene que tener unidades y decenas como minimo");
        
        }
        
       
        
        
        
        
        
        
    }
    
}

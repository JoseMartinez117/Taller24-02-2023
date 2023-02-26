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
public class PuntoN20 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
       Scanner teclado = new Scanner(System.in);
       int moneda1=0, moneda2=0, moneda3=0, euro=0, euro2=0, totale=0, totalc=0;
       
        System.out.println("Ingrese la cantidad de monedas que tenga de: ");
        System.out.print("10 centimos: ");
        moneda1=teclado.nextInt();
        System.out.print("20 centimos: ");
        moneda2=teclado.nextInt();
        System.out.print("50 centimos: ");
        moneda3=teclado.nextInt();
        System.out.print("1 euro: ");
        euro=teclado.nextInt();
        System.out.print("2 euros: ");
        euro2=teclado.nextInt();
        
        while(moneda1>=10){
            euro++;
            moneda1=moneda1-10;
        } 
        
        while(moneda2>=5){
            euro++;
            moneda2=moneda2-5;
        }
        
        while(moneda3>=2){
            euro++;
            moneda3=moneda3-2;
        }
        
        moneda1=moneda1*10;
        moneda2=moneda2*20;
        moneda3=moneda3*50;
        euro2=euro2*2;
        totalc=moneda1+moneda2+moneda3;
        
        while(totalc>=100){
          euro++;
          totalc=totalc-100;
        }
        
        totale=euro+euro2;
        
        System.out.println("Usted tiene "+totale+" de euros con "+totalc+" centimos");
    }
    
}

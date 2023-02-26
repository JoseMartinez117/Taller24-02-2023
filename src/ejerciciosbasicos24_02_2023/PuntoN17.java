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
public class PuntoN17 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        Scanner teclado = new Scanner(System.in);
        int hh=0, mm=0, ss=0, hh2=0, res=0, t=0;
        String ciudadA="", ciudadB="";
        
        System.out.println("Ingrese el nombre de la ciudad de la que parte");
        ciudadA=teclado.next();
        
        System.out.println("\nIngrese el tiempo en que salio de "+ciudadA);
        System.out.print("Hora: ");
        hh=teclado.nextInt();
        System.out.print("Minuto: ");
        mm=teclado.nextInt();
        System.out.print("Segundo: ");
        ss=teclado.nextInt();
        
        System.out.println("\nIngrese el nombre de la ciudad a la cual se dirige");
        ciudadB=teclado.next();
        
        System.out.println("\ncual es el tiempo de viaje aproximado hasta "+ ciudadB);
        hh2=teclado.nextInt();
        
        hh=hh*3600;
        hh2=hh2*3600;
        mm=mm*60;
        t=mm+hh+ss;
        res=t+hh2;
        res=res/3600;
        
        
        
        
        
        System.out.println("\nUsted llegara a "+ciudadB+" a las "+res+" ");
        
        
    }
    
}

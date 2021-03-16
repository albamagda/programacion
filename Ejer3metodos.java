/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package ejer3;

/**
 *
 * @author albamagdaleno
 */
public class Ejer3metodos {
    
    public static void imprime (String cadena){
        System.out.println(cadena);
    
    }
    public static void imprime(int numero){
        System.out.println(numero);
    }
    
    public static void imprime (String cadena, int longitud){
        System.out.println(cadena.substring(0, longitud));
    }
    
    public static void imprime(double numero, int decimal){
        System.out.printf("%."+decimal+"f", numero);
    }
    
}
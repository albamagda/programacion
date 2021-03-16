/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package ejer1;

/**
 *
 * @author albamagdaleno
 */
public class Ejer1 {

    public static void main(String[] args) {
        System.out.println("PELL");
        for(int i=0; i<10; i++){
            System.out.print(pell(i)+" - ");
        }
        System.out.println("\nLUCAS");
        for(int i=0; i<10; i++){
            System.out.print(lucas(i)+" - ");
        }
        System.out.println("\nFIBONACCI");
        for(int i=0; i<10; i++){
            System.out.print(fibonacci(i)+" - ");
        }
    }
    
    static int pell (int posicion){
        int retorno = 0;
        if(posicion == 1){
            retorno = 1;
        }
        if(posicion > 1){
            retorno = 2*pell(posicion - 1) + pell(posicion-2);
        }
        return retorno;
    }
    
    static int lucas (int posicion){
        int retorno = 0;
        if(posicion == 1 ){
            retorno = 1;
        }
        if(posicion > 1){
            retorno = lucas(posicion - 1) + 2*lucas(posicion - 2);
        }
        return retorno;
    
    }
    
    static int fibonacci (int posicion){
        int retorno = 0;
        if(posicion == 1){
            retorno = 1;
        }
        if(posicion > 1){
            retorno = fibonacci(posicion - 1) + fibonacci(posicion - 2);
        }
        return retorno;
    }
    
}

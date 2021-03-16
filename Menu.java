/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package menu;

import java.util.Scanner;

/**
 *
 * @author albamagdaleno
 */
public class Menu {

    public static void main(String[] args) {
        
        int numero=100;
        byte valor=0;
        byte opcion=1;
        Scanner entrada=new Scanner(System.in);
        entrada.useDelimiter("\n");
        while(opcion!=8){
            System.out.println("- MENÚ -");
            System.out.println("1. SUMAR");
            System.out.println("2. ELEVAR AL CUADRADO");
            System.out.println("3. DIVIDIR");
            System.out.println("4. RESTAR");
            System.out.println("5. RAIZ CUADRADA");
            System.out.println("6. MULTUPLICAR");
            System.out.println("7. RESULTADO");
            System.out.println("8. SALIR");
        
            System.out.println("Elija una opción");
            opcion = entrada.nextByte();
            
            switch(opcion){
                case 1:System.out.println("Dame un valor del 1 - 8");
                    valor = entrada.nextByte();
                    if(valor > 0 && valor < 9)
                    numero= numero + valor;
                    break;
                case 2: numero= numero*numero;
                    break;
                case 3: System.out.println("Dame un valor del 1 - 8");
                    valor = entrada.nextByte();
                    if(valor > 0 && valor < 9)
                        numero= numero / valor;
                    break;
                case 4: System.out.println("Dame un valor del 1 - 8");
                    valor = entrada.nextByte();
                    if(valor > 0 && valor < 9)
                    numero= numero - valor;
                    break;
                case 5: numero = (int) Math.sqrt(numero);
                    break;
                case 6: System.out.println("Dame un valor del 1 - 8");
                    valor = entrada.nextByte();
                    if(valor > 0 && valor < 9)
                    numero= numero * valor;
                    break;
                case 7: System.out.println(numero);
                    break;
                case 8: System.out.println("Saliendo de la aplicación");
                    break;
                default: System.out.println("Opción incorrecta");
                    break;
            }
        }
    }
    
}

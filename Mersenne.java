/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package mersenne;

/**
 *
 * @author albamagdaleno
 */
public class Mersenne {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        int resultado=0;
        int contadoraciertos=0;
        for(int i=0; contadoraciertos<8; i++){
            if(primo(i)){
               resultado=descomponer(i);
                if(resultado>0){
                    System.out.println(contadoraciertos +". "+i+"=2^"+resultado);
                    contadoraciertos++;
                } 
            }
        }
    }
    static int descomponer(int numero){
        boolean espar=true;
        int contador=0;
        numero++;
        if (numero%2 == 0){
            while (numero > 1 && espar){
                if(numero%2 != 0){
                    espar = false;
                }else{
                    contador++;
                    numero=numero/2;
                }
            }
        }
        if(espar){
             return contador;
        }else{
            return 0;
        }
       
    }
    
    static boolean primo(int numero){
        boolean retorno=true;
        for(int i=2; i <= numero/2; i++){
            if(numero!=i){
                if(numero%i == 0){
                retorno = false;
                }
            }
            
        }
        return retorno;
    }
}

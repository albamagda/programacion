/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package ficheros;

import java.io.File;

/**
 *
 * @author albamagdaleno
 */
public class Ficheros {

    public static void main(String[] args) {
        String ruta="/Users/albamagdaleno/documentacio2020";
        File directorio= new File(ruta); 
        String meses[]={"Enero","Febrero","Marzo","Abril","Mayo","Junio","Julio","Agosto","Septiembre","Octubre","Noviembre","Diciembre"};
        File[] ficheros= directorio.listFiles();
        for(File f:ficheros){
            if(f.getName().substring(f.getName().length()-3,f.getName().length()).equals("doc")){
                System.out.println(f.getName());
                int posicion = f.getName().indexOf("_");
                int m = Integer.parseInt(f.getName().substring(posicion+1,posicion+3));
                System.out.println(meses[m - 1]);
                File carpeta = new File(ruta+"/"+meses[m-1]);
                if( carpeta.exists()){
                    f.renameTo(new File(carpeta.getAbsolutePath()+"/"+f.getName()));
                }else{
                    carpeta.mkdir();
                    f.renameTo(new File(carpeta.getAbsolutePath()+"/"+f.getName()));
                    
                }
            }
           
        }
        
    }
    
}

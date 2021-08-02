
package sistemaescolar;

import java.util.HashMap;
import java.util.Map;
import java.util.Scanner;



public class SistemaEscolar {
    
    public static void main(String[] args) {
        
        Scanner leer= new Scanner(System.in);
        Alumno []alumno = new Alumno[5];
        Map<String,Alumno> lista = new HashMap<String,Alumno>(); 
        //Informacion alumno= new Informacion();
        
        
        for (int i = 0; i < alumno.length; i++) {
             alumno[i]=new Alumno();
             System.out.println(alumno[i]);
        //alumno[i].getNombre();
        }
        
        
    }
}
/*
        int buscar=2,num=0;
    
            
            if(buscar==2){
                System.out.println("NOmbre " + alumno.nombreCompleto[2]);
            }
//HashMao
                
     
        //alumno.toString();
        alumno.toString();
        //falso.getNombre();
        //System.out.println(alumno);
        System.out.println(alumno);*/
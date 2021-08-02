/*package sistemaescolar;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Random;

public class Informacion {
   
    private String [] nombreCompleto= new String[5];
    private String direccion;
    private int [] edad;

    public Informacion() {
    }

    public String[] getNombreCompleto() {
        
        
        return nombreCompleto;
    }

    public void setNombreCompleto(String[] nombreCompleto) {
        this.nombreCompleto = nombreCompleto;
    }

    public String getDireccion() {
        return direccion;
    }

    public void setDireccion(String direccion) {
        this.direccion = direccion;
    }

    public int[] getEdad() {
         
        return edad;
    }

    public void setEdad(int[] edad) {
        this.edad = edad;

    }
     
    public int[] generarEdad(int [] edad){
    //Edad es aleatoria, de edades de entre 18 – 27.
    //rnd.nextInt(HASTA-DESDE+1)+DESDE
    Random rnd= new Random();
    int[] edadRandom=new int[5];
        for (int i = 0; i < 5; i++) {
            edadRandom[i]=rnd.nextInt(27-18+1)+18; 
            edad[i]=edadRandom[i];
        }
        for (int i = 0; i < edadRandom.length; i++) {
            System.out.println(edadRandom[i]);
        }
    return edadRandom;
    }
    
    public String [] generarNombres(String [] nombreCompleto){
  
    Random rnd= new Random();
    String [] nombre={"Daniel", "Ricardo","Jennifer","Carlos","Maria"};
    String [] apellido= {"Prado", "Martinez", "Castillo", "Lujan","Hernandez"};
    
    String [] Complete=new String[5];
 
        for (int i = 0; i < 5; i++) {        //HASTA         -DESDE+1 + DESDE 
            Complete[i]=nombre[ rnd.nextInt( ( (nombre.length-1)-0 +1) + 0) ] +" "
                        +apellido[ rnd.nextInt( ( (apellido.length-1)-0+1) + 0) ] ;
            nombreCompleto[i]=Complete[i];
        }
         for (int i = 0; i < nombreCompleto.length; i++) {
                System.out.println(nombreCompleto[i]);
        }
        
       
    return Complete;
    }
    
   

    @Override
    public String toString() {
        return "Informacion{" + "nombreCompleto=" + Arrays.toString(nombreCompleto) + ", direccion=" + direccion + ", edad=" + Arrays.toString(edad) + '}';
    }



 
    
 
    
}

*/
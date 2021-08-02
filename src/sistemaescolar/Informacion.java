package sistemaescolar;

import java.io.FileNotFoundException;
import java.io.IOException;
import java.io.RandomAccessFile;
import java.security.SecureRandom;
import java.util.logging.Level;
import java.util.logging.Logger;

import java.util.Arrays;




public class Informacion {
    
    protected int [] edad= new int[5] ;
    protected String [] nombreCompleto =new String[5];
    protected String[] direccion= new String[5];
    
    private String[] nombre= {"Daniel", "Ricardo","Jennifer","Carlos","Maria"};
    private String[] apellido={"Prado", "Martinez", "Castillo", "Lujan","Hernandez"};;
    
    SecureRandom rnd= new SecureRandom();
    
    public Informacion()
    {//Constructor
       
        for (int i = 0; i < nombreCompleto.length; i++) {    
        this.nombreCompleto[i]=nombre[ rnd.nextInt( ( (nombre.length-1)-0 +1) + 0) ] +" "
                         +apellido[ rnd.nextInt( ( (apellido.length-1)-0+1) + 0) ] ;   
        }
     
        for (int i = 0; i < edad.length; i++) {
             this.edad[i]=rnd.nextInt(27-18+1)+18; 
        }
        //this.edad=  ;
        try{
            RandomAccessFile rm= new RandomAccessFile("CiudaddeMexico.txt","r");
            rm.seek(392);      
            
            for(int i =0; i<direccion.length;i++){    
                direccion[i]=rm.readLine()+"\n";  
            }                         
             rm.close();// Se cierra el archivo
        }catch (FileNotFoundException ex) { //Hacen excepciones
            Logger.getLogger(Informacion.class.getName()).log(Level.SEVERE, null, ex);
        }catch (IOException ex) {
          Logger.getLogger(Informacion.class.getName()).log(Level.SEVERE, null, ex);
        }
       
    }
    
    public void nombreCompleto(){
       
       SecureRandom rnd= new SecureRandom();
        
        for (int i = 0; i < nombreCompleto.length; i++) {        //HASTA         -DESDE+1 + DESDE 
            nombreCompleto[i]=nombre[ rnd.nextInt( ( (nombre.length-1)-0 +1) + 0) ] +" "
                        +apellido[ rnd.nextInt( ( (apellido.length-1)-0+1) + 0) ] ;
        }
        
         for (int i = 0; i < nombreCompleto.length; i++) {
                System.out.println(nombreCompleto[i]);
         }       
         
    }
    

    public void getEdad(){
        
       SecureRandom rnd= new SecureRandom();
        
        for (int i = 0; i < edad.length; i++) {
            edad[i]=rnd.nextInt(27-18+1)+18; 
        }
        //return edad;
        /*
        for (int i = 0; i < edad.length; i++) {
            System.out.println(edad[i]);
            
        }     
        */
    }
    
    public String[] getDireccion(){
    
        SecureRandom rnd= new SecureRandom();
        int cont =0;
        String aux;
        try {
               //direccion es una arreglo string
            RandomAccessFile rm= new RandomAccessFile("CiudaddeMexico.txt","r");
            rm.seek(392);
            
            //2-1515
            /*
            while((aux=rm.readLine() )!= null){
                cont++;
                cont= rnd.nextInt(1515-2+1)+2;
                
                aux=rm.readLine()+"";
            }*/
            
            System.out.println("Hay en total de lineas"+cont);
            
            for(int i =0; i<direccion.length;i++){
                
                direccion[i]=rm.readLine()+"\n";
               
            }  
            
            System.out.println(cont);
            rm.close();// Se cierra el archivo
            
         } catch (FileNotFoundException ex) { //Hacen excepciones
            Logger.getLogger(Informacion.class.getName()).log(Level.SEVERE, null, ex);
        } catch (IOException ex) {
            Logger.getLogger(Informacion.class.getName()).log(Level.SEVERE, null, ex);
        }
    
        return direccion;
    }
 
    
    @Override
    public String toString() {
        return "Informacion{\n" 
               
            
                + "\nNombreCompleto=" + Arrays.toString(nombreCompleto) 
                + "\nDireccion=\n" + Arrays.toString(direccion) 
                + "\nEdad=" + Arrays.toString(edad) + '}';
    }
    
}

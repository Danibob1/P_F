
package sistemaescolar;

import java.util.Arrays;




public class Alumno extends Informacion{
 
    //Relacion Has-A(tiene )
    //private Informacion[] paquete;
    private String numCuenta;
    private int numInscripcion;
    private String materias;
    
    //Key, Valor
        
    public Alumno() {
        super();
    }
    
    
    
    public void getNombre(){
        
        
        for (int i = 0; i < 3; i++) {
            System.out.println("\n"
                    +"Nombre del estudiante: "+nombreCompleto[i]
                    +"\nEdad: "+edad[i]
                    +"\nDirección: "+direccion[i]
                    +"Numero de cuenta: "
                    +"\nMaterias"
                    + "\nNumero de Inscripcion");
        
        }
    }
    
    
   
    @Override
    public String toString() {
        return "\n"+super.toString()+"\n Alumno{" + "\numCuenta=" + numCuenta 
                + "\n numInscripcion=" + numInscripcion + '}';
    }
}
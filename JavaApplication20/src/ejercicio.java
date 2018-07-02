
import java.io.FileWriter;
import java.io.IOException;

/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author ESFOT
 */
public class ejercicio {
    
    public static void main(String[] args) {
        // TODO code application logic here
        
        //System.out.println("hola mundo ");
        
        FileWriter fichero;
        try{
            //las siguientes dos lineas pueden lanzar una excepcion de tipo IOException 
            fichero = new FileWriter("ruta");
            fichero.write("esto se escribira en el fichero");
        } catch(IOException ioex){
            //aqui capturamos cualquier excepcion IOException que se lance (incluidas sus subclases)
            ioex.printStackTrace();
            
            
        }
        
        
    }
    
}


import java.io.BufferedReader;
import java.io.File;
import java.io.FileReader;

/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author ESFOT
 */
public class LeerFichero {
    
    public static void main(String[] args) {
        
        File archivo = null;
        FileReader fr = null;
        BufferedReader br = null;
        
        
        try{
           //apertura del fichero y creacion de BufferedReader para poder 
           //hacer una lectura comoda (disponer del metodo readLine())
           
           archivo = new File("C:\\Users\\ESFOT\\Documents\\archivo1.txt");
           fr = new FileReader(archivo);
           br = new BufferedReader(fr);
           
           //lectura del archivo 
           String linea;
           while((linea = br.readLine()) != null)
                System.out.println(linea);
           
        }catch(Exception e){
            e.printStackTrace();
        }finally{
            //en el finally cerramos el fichero, para asegurarnos
            // que se cierra tanto si todo va bien como si salta 
            //una excepcion 
            
            try{
                if(null != fr){
                    fr.close();
                }
            }catch(Exception e2){
                e2.printStackTrace();
            }
        }
        
        
        
    }
    
}

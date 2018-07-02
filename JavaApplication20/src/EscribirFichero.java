
import java.io.FileWriter;
import java.io.PrintWriter;

/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author ESFOT
 */
public class EscribirFichero {
    public static void main(String[] args) {
        FileWriter fichero = null;
        PrintWriter pw = null;
        
        try{
            fichero = new FileWriter("C:\\Users\\ESFOT\\Documents\\archivo1.txt");
            pw = new PrintWriter(fichero);
            
            for(int i = 0 ; i< 10;i++)
                pw.println("Linea " + i);
        
            
        }catch(Exception e){
            e.printStackTrace();
        }finally{
            try{
                //nuevamente aprovechamos el finally para 
                //asegurarnos que se cierre el fichero 
                if(null != fichero)
                    fichero.close();
            }catch (Exception e2){
                e2.printStackTrace();
            }
        }
        
        
        
    }
    
    
    
}

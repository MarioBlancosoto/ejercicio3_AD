
package copybytesimaxe;

import java.io.BufferedInputStream;
import java.io.BufferedOutputStream;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.IOException;
import java.util.logging.Level;
import java.util.logging.Logger;


public class Metodos {
    
       static FileInputStream fis;
       static FileOutputStream fos;int caracteres =0;
       static BufferedInputStream bufi;
       static BufferedOutputStream bufo;
       public static void metodos (){
        try {
            fos = new FileOutputStream("/home/local/DANIELCASTELAO/mblancosoto/NetBeansProjects/copybytesimaxe/foto2.jpg");
            fis = new FileInputStream("/home/local/DANIELCASTELAO/mblancosoto/NetBeansProjects/copybytesimaxe/foto.jpg");
            int caracteres =0;
            
            while (caracteres!=-1){
            caracteres = fis.read();
               
                fos.write(caracteres);
            }
            
        } catch (FileNotFoundException ex) {
            Logger.getLogger(Metodos.class.getName()).log(Level.SEVERE, null, ex);
        } catch (IOException ex) {
            Logger.getLogger(Metodos.class.getName()).log(Level.SEVERE, null, ex);
        }
       try {
           fis.close();
           fos.close();
       } catch (IOException ex) {
           Logger.getLogger(Metodos.class.getName()).log(Level.SEVERE, null, ex);
       }
        
    }
       
       public static void conBuffer(){
           bufi = new BufferedInputStream(fis);
           bufo = new BufferedOutputStream(fos);
           
           
           
       }
    
}
    


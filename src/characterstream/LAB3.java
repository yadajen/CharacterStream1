
package characterstream;

import java.io.*;
import java.util.logging.Level;
import java.util.logging.Logger;


public class LAB3 {

    
    public static void main(String[] args) {
        try {
            PrintWriter output = new PrintWriter("data.txt");
            output.println("Harry Potter");
            output.println(19);
            output.println(42.5);
            output.println(162.5);
            output.close();
        } catch (FileNotFoundException ex) {
            Logger.getLogger(LAB3.class.getName()).log(Level.SEVERE, null, ex);
        }
        
        try {
            int ch;
            FileReader input = new FileReader("data.txt");
            while ((ch=input.read()) != -1){
            System.out.print((char)ch);
        }  
        } catch (FileNotFoundException ex) {
            Logger.getLogger(LAB1.class.getName()).log(Level.SEVERE, null, ex);
        } catch (IOException ex) {
            Logger.getLogger(LAB1.class.getName()).log(Level.SEVERE, null, ex);
        }
    }
        
    }
    


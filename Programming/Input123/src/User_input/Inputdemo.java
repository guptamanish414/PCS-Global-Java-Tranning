/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package User_input;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.logging.Level;
import java.util.logging.Logger;

/**
 *
 * @author ARNAB
 */
public class Inputdemo {
    public static void main(String[] args) {
        BufferedReader br=new BufferedReader( new InputStreamReader(System.in));
        System.out.println("Enter some number : ");
        try {
            int a=Integer.parseInt(br.readLine());
            System.out.println("Enter anoter number : ");
            int b=Integer.parseInt(br.readLine());
            int c= a+b;
            
             System.out.println("Addition of two nos is "+c);
        } catch (IOException ex) {
            Logger.getLogger(Inputdemo.class.getName()).log(Level.SEVERE, null, ex);
        }
         catch (NumberFormatException e1){
                     System.out.println("Please check your input"); 
             
         }

           
        
    }
    
}

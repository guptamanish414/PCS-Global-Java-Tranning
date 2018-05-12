/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package userinput;

/**
 *
 * @author Manish Kr Gupta
 */
import java.io.*;
public class InputDemo {
    public static void main(String[] args) 
    {
        BufferedReader ad=new BufferedReader(new InputStreamReader(System.in));
        System.out.println("Enter Some Text");
        try{
        int s1=Integer.parseInt(ad.readLine());
         System.out.print(s1);
        }catch(IOException e){
            System.out.println("Error :");
        }
        catch(NumberFormatException e){
            System.out.println("Error in Input ");
        }
       
        
    }
}

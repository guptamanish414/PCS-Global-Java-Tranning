/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package userinput;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

/**
 *
 * @author Manish Kr Gupta
 */
 import java.io.*;
public class InputDemo2 {
    public static void main(String[] args) throws IOException 
    {
        BufferedReader ad=new BufferedReader(new InputStreamReader(System.in));
        System.out.println("Enter Some Text");
        int s1=Integer.parseInt(ad.readLine());
         System.out.print(s1);
       
        
    }
}

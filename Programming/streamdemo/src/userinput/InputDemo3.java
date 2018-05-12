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
public class InputDemo3 {
 int a,b,c;
  BufferedReader ad=new BufferedReader(new InputStreamReader(System.in));
  public void getData()
  {
      try
      {
           System.out.println("Enter Ist Value:");
             a=Integer.parseInt(ad.readLine());
             System.out.println("Enter the 2nd number:");
             b=Integer.parseInt(ad.readLine());  
      }
      catch(IOException e)
      {
         System.out.println("Error");
      }   
            catch(NumberFormatException e)
      {
         System.out.println("Wrong input");
      }
  }
    
  public void addition()
  {
      c=(a+b);
      System.out.println("Addition Result Is:="+c);
  }
  
}
class Demo
{
    public static void main(String[] args)
    {
        InputDemo3 obj=new InputDemo3();
        obj.getData();
        obj.addition();
    }
}

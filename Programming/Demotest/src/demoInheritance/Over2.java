/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package demoInheritance;

/**
 *
 * @author pcs
 */
public class Over2 {
    
    void area(int a, int b, int c){
        int r= 1/2*(a*b*c);
        System.out.println("Area or Triangle "+ r);
    }
    public static void main(String args[]){
        Over o1=new Over();
        Over2 o2=new Over2();
        o1.area(3,4,5);
        o2.area(5,6,7);
    }
    
}

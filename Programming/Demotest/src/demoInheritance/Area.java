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
public class Area {
    void ar(int a){
        System.out.println("Normal area "+ a);
    }
    void ar(int a, int b){
        int z=a*b;
        System.out.println("Square area "+ z);
    }
    void ar(int a, int b, int c){
        int z=a*b*c;
        System.out.println("Rectangtle area "+ z);
    }
    public static void main(String args[]){
        Area a=new Area();
        a.ar(5);
        a.ar(2,4);
        a.ar(2,3,2);
    }
    
}

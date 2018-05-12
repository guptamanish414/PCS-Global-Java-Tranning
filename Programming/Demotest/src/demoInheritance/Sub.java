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
public class Sub extends Parr {

    void sub() {
        System.out.println("I am Subparent");
    }

    public static void main(String[] args) {
        try {
            //    Sub s = (Sub) new Parr();
            Sub s = new Sub();
            Sub s1 = (Sub) new Parr();
            //s.sub();
            s1.sub();
            //  p.parr();    
        } catch (Exception e) {
            System.out.println("" + e);
        }
    }

}

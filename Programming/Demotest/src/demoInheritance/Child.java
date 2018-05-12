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
public class Child extends Sub{
    void parr(){
        System.out.println("This is Child");
    }
    public static void main(String args[]){
        Child c=new Child();
       // c.child();
        c.sub();
       // c.parr();
        
       
    }
}

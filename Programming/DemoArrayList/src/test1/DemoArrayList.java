/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package test1;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.LinkedList;

/**
 *
 * @author ARNAB
 */
public class DemoArrayList {
    public static void main(String[] args) {
        ArrayList<String> al = new ArrayList<String>();
        al.add("hello");
        al.add("hi");
        al.add("bye");
        
        
        
       System.out.println("This is a demo exm of array list");
        al.add("Fine");
        Iterator itr = al.iterator();
        while(itr.hasNext()){
            System.out.println("Values are ="+itr.next());
        }
        
    }
    
}

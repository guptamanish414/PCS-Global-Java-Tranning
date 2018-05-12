/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package test1;

/**
 *
 * @author pcs
 */
public class Sum {
    void demo(int x, int y){
        int z= x+y;
        System.out.println("Sum is "+z);
    }
    public static void main(String args[]){
        Sum s=new Sum();
        s.demo(3,9);
    }
}

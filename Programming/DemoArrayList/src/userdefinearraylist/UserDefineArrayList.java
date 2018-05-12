/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package userdefinearraylist;

import java.util.ArrayList;
import java.util.Iterator;

/**
 *
 * @author ARNAB
 */
public class UserDefineArrayList {

    DemoValues demo1 = new DemoValues("pratip", 123, 45.56);
    DemoValues demo2 = new DemoValues("ayan", 12, 55.56);
    DemoValues demo3 = new DemoValues("manish", 34, 95.56);

    public void test() {
        ArrayList<DemoValues> al2 = new ArrayList<DemoValues>();
        al2.add(demo1);
        al2.add(demo2);
        al2.add(demo3);
        
        Iterator itr = al2.iterator();
        while(itr.hasNext()){
            DemoValues d =(DemoValues)itr.next();
            System.out.println(d.id + " "+d.name+" "+d.roll);
        }
        
    }

    public static void main(String[] args) {
        UserDefineArrayList userDefine = new UserDefineArrayList();
        userDefine.test();
    }

}

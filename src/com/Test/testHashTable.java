package com.Test;

import java.util.Enumeration;
import java.util.Hashtable;

/**
 * Created by Administrator on 2017/6/29 0029.
 */
public class testHashTable {
    public static void main(String[] args) {
        Hashtable ht = new Hashtable();
        ht.put("1", "a");
        ht.put("2", "b");
        ht.put("3", "c");
        Enumeration e = ht.keys();
        Enumeration ee=ht.elements();
        while (e.hasMoreElements()){
            System.out.println(e.nextElement());
        }
        while (ee.hasMoreElements()){
            System.out.println(ee.nextElement());

        }
    }
}

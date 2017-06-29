package com.Test;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;

/**
 * Created by Administrator on 2017/6/28 0028.
 */
public class TestArrayList {
    public static void main(String[] args) {
        List<String> list = new ArrayList<String>();
        list.add("555");
        list.add("666");
        list.add("777");
        for (String str : list) {
            System.out.println(str);
        }

        String[] strArray = new String[list.size()];
        list.toArray(strArray);
        for (int i = 0; i < strArray.length; i++) {
            System.out.println(strArray[i]);
        }

        Iterator<String> ite = list.iterator();
        while (ite.hasNext()){
            System.out.println(ite.next());
        }
    }
}

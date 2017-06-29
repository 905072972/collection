package com.Test;

import java.util.*;

/**
 * Created by Administrator on 2017/6/29 0029.
 */
public class TestAll {
    public static void main(String[] args) {
        List linlist = new LinkedList();
        linlist.add("element1");
        linlist.add("element1");
        linlist.add("element1");
        displayAall(linlist);
        List arrlist = new ArrayList();
        arrlist.add("a");
        arrlist.add("b");
        arrlist.add("c");
        displayAall(arrlist);
        Set hashSet = new HashSet();
        hashSet.add("set1");
        hashSet.add("set2");
        hashSet.add("set3");
        displayAall(hashSet);
        SortedSet treeSet = new TreeSet();
        treeSet.add("1");
        treeSet.add("2");
        treeSet.add("3");
        displayAall(treeSet);
        LinkedHashSet linkedHashSet = new LinkedHashSet();
        linkedHashSet.add("x");
        linkedHashSet.add("y");
        linkedHashSet.add("z");
        displayAall(linkedHashSet);
        Map hmap = new HashMap();
        hmap.put("1", "a");
        hmap.put("2", "b");
        hmap.put("2", "c");
        displayAall(hmap.keySet());
        displayAall(hmap.values());
        SortedMap smap = new TreeMap();
        smap.put("1", "aa");
        smap.put("2", "bb");
        smap.put("3", "cc");
        displayAall(smap.keySet());
        displayAall(smap.values());
        LinkedHashMap lhmap=new LinkedHashMap();
        lhmap.put("1","aaa");
        lhmap.put("2","bbb");
        lhmap.put("3","ccc");
        displayAall(lhmap.keySet());
        displayAall(lhmap.values());

    }

    static void displayAall(Collection col) {
        Iterator ite = col.iterator();
        while (ite.hasNext()) {
            String str = (String) ite.next();
            System.out.println(str + " ");
        }
        System.out.println("");
    }

}

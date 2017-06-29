package com;

import java.util.TreeMap;

/**
 * Created by Administrator on 2017/6/28 0028.
 */
public class testTreeMap {
    public static void main(String[] args) {
        TreeMap tMap = new TreeMap();
        tMap.put(1, "Sunday");
        tMap.put(2, "Monday");
        tMap.put(3, "Tuesday");
        tMap.put(4, "Wednesday");
        tMap.put(5, "Thursday");
        tMap.put(6, "Friday");
        tMap.put(7, "Saturday");
        System.out.println("TreeMap 键：" + tMap.keySet());
        System.out.println("TreeMap 值：" + tMap.values());
        System.out.println("键为 5 的值为: " + tMap.get(5) + "\n");
        System.out.println("第一个键: " + tMap.firstKey() + " Value: " + tMap.get(tMap.firstKey()) + "\n");
        System.out.println("最后一个键: " + tMap.lastKey() + " Value: "+ tMap.get(tMap.lastKey()) + "\n");
        System.out.println("移除第一个数据: " + tMap.remove(tMap.firstKey()));
        System.out.println("现在 TreeMap 键为: " + tMap.keySet());
        System.out.println("现在 TreeMap 包含: " + tMap.values() + "\n");
        System.out.println("移除最后一个数据: " + tMap.remove(tMap.lastKey()));
        System.out.println("现在 TreeMap 键为: " + tMap.keySet());
        System.out.println("现在 TreeMap 包含: " + tMap.values());

    }
}

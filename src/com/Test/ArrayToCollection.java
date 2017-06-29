package com.Test;

import java.util.Arrays;
import java.util.List;

/**
 * Created by Administrator on 2017/6/28 0028.
 */
public class ArrayToCollection {
    public static void main(String[] args) {
        int n = 5;
        String[] name = new String[n];
        for (int i = 0; i < 5; i++) {
            name[i] = String.valueOf(i);
        }
        List<String> list = Arrays.asList(name);
        for (String li : list) {
            String str = li;
            System.out.println(" " + str);
        }
    }


}

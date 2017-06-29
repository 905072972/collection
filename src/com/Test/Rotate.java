package com.Test;

import java.util.Arrays;
import java.util.Collections;
import java.util.List;

/**
 * Created by Administrator on 2017/6/29 0029.
 */
public class Rotate {
    public static void main(String[] args){
        List list= Arrays.asList("a b c d e f".split(" "));
        System.out.println("List :"+list);
        Collections.rotate(list,7);
        System.out.println("rotate"+list);
    }
}

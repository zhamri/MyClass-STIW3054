package com.stiw3054.lambda;

import java.util.ArrayList;
import java.util.List;

public class Example6 {

    public static void main(String[] args) {
        List<String> list = new ArrayList<String>();
        list.add("one");
        list.add("two");
        list.add("three");
        list.add("four");

        list.forEach(
                (n) -> System.out.println(n)
        );
    }
}


/***
 * one
 * two
 * three
 * four
 */
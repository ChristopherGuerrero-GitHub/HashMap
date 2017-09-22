package com.example.java;

import java.util.HashMap;
import java.util.Map;

public class Main {

    public static void main(String[] args) {

        /*
            This program creates a HashMap<String, String> and puts several states and cities. Print out the map
            and then remove one of the elements in the HashMap and then reprint to see the new updated results
            of the HashMap
         */
        Map<String , String> map = new HashMap<>();

        map.put("California","Sacramento");
        map.put("Oregon","Salem");
        map.put("Washington","Olympia");
        System.out.println(map);

        map.put("Alaska","Juneau");
        System.out.println(map);

        String cap = map.get("Oregon");
        System.out.println("The capitol of Oregon is: " + cap);

        map.remove("California");
        System.out.println(map);

    }
}

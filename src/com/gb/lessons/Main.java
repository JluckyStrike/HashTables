package com.gb.lessons;

import java.util.Random;

public class Main {

    public static void main(String[] args) {
        ChainingHashMap<Integer, String> chainingHashMap = new ChainingHashMap<>(5);

        chainingHashMap.put(56, "val");
        chainingHashMap.put(65, "val");
        chainingHashMap.put(5, "val");
        chainingHashMap.put(12, "val");
        chainingHashMap.put(100, "val");

        System.out.println(chainingHashMap);
        chainingHashMap.delete(100);
        System.out.println(chainingHashMap);
    }
}

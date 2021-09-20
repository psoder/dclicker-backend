package com.example.demo;

public class Counter {

    private int count = 0;

    public int updateCount(int n) {
        return count += n;
    }

    public int setCount(int n) {
        return count = n;
    }

    public int getCount() {
        return count;
    }

    public String toJSON() {
        return 
            "\"counter\": {\n" + 
            "\t\"value\": " + count + "\n" +
            "}";
    }
}
package com.company;

import java.net.SocketTimeoutException;
import java.util.ArrayList;

public class Main {

    public static void main(String[] args) {
        ArrayList<String> peoples1 = new ArrayList<String>();
        peoples1.add("Kolj");
        peoples1.add("Olga");
        peoples1.add("Gleb");
        peoples1.add("Dima");
        peoples1.add("Tom");

        ArrayList<String> peoples2 = new ArrayList<String>();
        peoples2.add("Olga");
        peoples2.add("Viktor");
        peoples2.add("Gleb");

        for(String i : peoples2)
            peoples1.remove(i);
        System.out.print(peoples1);


    }
}

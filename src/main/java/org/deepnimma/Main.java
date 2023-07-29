package org.deepnimma;

import org.deepnimma.interfaces.DataStructure;
import org.deepnimma.linkedlists.LinkedList;

public class Main {
    public static void main(String[] args) {
        DataStructure<Integer> myDS = new LinkedList<>();

        for (int i = 0; i <= 5; i++) {
            myDS.insert(i);
        } // for

        System.out.println(myDS.get(0));
        System.out.println(myDS.getFirstValue());
        System.out.println(myDS.get(myDS.size() - 1));
        System.out.println(myDS.getLastValue());

        System.out.println(myDS);
        System.out.println(myDS.size());
    } // main
} // Main
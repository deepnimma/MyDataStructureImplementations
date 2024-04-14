package org.deepnimma;

import org.deepnimma.interfaces.GenericStructure;
import org.deepnimma.lists.arraybased.ArrayList;

import java.util.LinkedList;
import java.util.List;

/**
 * Main runner.
 */
public class Main {
    /**
     * Main function.
     * @param args command line arguments.
     */
    public static void main(String[] args) {
        GenericStructure<Integer> a = new ArrayList<>(5, false);

        a.add(1);
    } // main
} // Main
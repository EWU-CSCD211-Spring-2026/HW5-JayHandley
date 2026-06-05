package test;

import universe.*;
import java.util.ArrayList;
import java.util.HashSet;
import java.util.Collections;

public class AppCollections {
    public static void main(String[] args) {

        ArrayList<Universe> multiverse = new ArrayList<Universe>();
        HashSet<Universe> uniqueMultiverse = new HashSet<Universe>();

        System.out.println("Creating Multiverse");
        for(int i = 1; i <= 1000; i++) {
            multiverse.add(new Universe());
        }

        System.out.println("Total universes in multiverse: " + multiverse.size());
        System.out.println("Sorted universes by ID: ");
        Collections.sort(multiverse);
        for(Universe u : multiverse) {
            System.out.println(u.getID());
        }


        System.out.println("Creating Multiverse with Unique Universes");
        for(int i = 1; i <= 1000; i++) {
            uniqueMultiverse.add(new Universe());
        }

        System.out.println("Total universes in unique multiverse: " + uniqueMultiverse.size());

    }
}
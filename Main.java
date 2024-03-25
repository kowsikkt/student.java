package kowsik;
import java.util.ArrayList;
import java.util.Collections;
import java.util.HashSet;

public class Main {
    public static void main(String[] args) {
        
        ArrayList<String> names = new ArrayList<>();

        
        names.add("John");
        names.add("Alice");
        names.add("Bob");
        names.add("Alice"); 

        
        Collections.sort(names);
        System.out.println("Sorted names: " + names);

        
        names.clear();
        System.out.println("Names after clearing: " + names);

        
        ArrayList<String> candidates = new ArrayList<>();

        
        HashSet<String> uniqueNames = new HashSet<>();
        uniqueNames.add("kowsik");
        uniqueNames.add("abi");
        uniqueNames.add("Bala");
        uniqueNames.add("sandy"); 
        // Add unique names to candidates
        for (String name : uniqueNames) {
            candidates.add(name);
        }

        // Displaying candidates without duplicates
        System.out.println("Candidates without duplicates: " + candidates);
    }
}

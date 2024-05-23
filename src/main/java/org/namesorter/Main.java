package org.namesorter;

import org.namesorter.solid.FileReader;
import org.namesorter.solid.NameSorter;
import org.namesorter.solid.SortingNames;

import java.io.FileNotFoundException;
import java.util.List;

public class Main {
    public static void main(String[] args) {
        if (args.length == 0) {
            System.out.println("Please provide a filename as an argument.");
            return;
        }

        String filename = args[0];
        FileReader fileReader = new FileReader();
        NameSorter nameSorter = new SortingNames();

        try {
            List<String> content = fileReader.readFile(filename);
            List<String> sortedNames = nameSorter.sort(content);

            for (String name : sortedNames) {
                System.out.println(name);
            }
        } catch (FileNotFoundException e) {
            System.out.println("File not found: " + filename);
        }
    }
}

package org.namesorter;

import org.namesorter.solid.FilePrinter;
import org.namesorter.solid.FileReader;
import org.namesorter.solid.NameSorter;
import org.namesorter.solid.Printer;
import org.namesorter.solid.Reader;
import org.namesorter.solid.SortingNames;

import java.io.FileNotFoundException;
import java.util.List;

public class Main {
    public static void main(String[] args) {
        if (args.length == 0) {
            System.out.println("Please provide a filename as an argument (with .txt extension).");
            return;
        }

        String filename = args[0];
        Reader fileReader = new FileReader();
        NameSorter nameSorter = new SortingNames();
        Printer filePrinter = new FilePrinter();

        try {
            List<String> content = fileReader.read(filename);
            List<String> sortedNames = nameSorter.sortByLastName(content);
            filePrinter.print(sortedNames);

            for (String name : sortedNames) {
                System.out.println(name);
            }
        } catch (FileNotFoundException e) {
            System.out.println("File not found: " + filename);
        }
    }
}

package org.namesorter.solid;

import java.io.BufferedWriter;
import java.io.FileWriter;
import java.io.IOException;
import java.util.List;

public class FilePrinter implements Printer {

    /** Writes each item from a list to external text file.
     * text file created if it does not exist.
     * @param sortedNames is a List of Strings;
     */
    @Override
    public void print(List<String> sortedNames) {
        try (BufferedWriter writer = new BufferedWriter(new FileWriter("sorted-names-list.txt"))) {
            for (String name : sortedNames) {
                writer.write(name + "\n");
            }
        } catch (IOException e) {
            e.printStackTrace();
        }
    }
}

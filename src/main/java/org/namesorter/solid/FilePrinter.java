package org.namesorter.solid;

import java.io.BufferedWriter;
import java.io.FileWriter;
import java.io.IOException;
import java.util.List;

public class FilePrinter implements Printer {

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

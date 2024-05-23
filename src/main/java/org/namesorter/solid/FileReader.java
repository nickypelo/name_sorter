package org.namesorter.solid;

import java.io.File;
import java.io.FileNotFoundException;
import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class FileReader implements Reader {

    /** Reads content of a .txt file.
     * @param filename is name of .txt file. finale inclusive of .txt 'example.txt'.
     * @return List of Strings
     * each string is each line from example.txt file.
     */
    @Override
    public List<String> read(String filename) throws FileNotFoundException {
        List<String> content = new ArrayList<>();
        File myFile = new File(filename);
        Scanner reader = new Scanner(myFile);
        while (reader.hasNextLine()) {
            String name = reader.nextLine();
            content.add(name);
        }
        reader.close();
        return content;
    }
}


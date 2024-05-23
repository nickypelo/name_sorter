package org.namesorter.solid;

import java.io.FileNotFoundException;
import java.util.List;

public interface Reader {
    /** Reads content of a specified file
     * @param filename of file.
     * @return what is read as a list of strings from each line
     */
    List<String> read(String filename) throws FileNotFoundException;
}

package org.namesorter.solid;

import java.io.FileNotFoundException;
import java.util.List;

public interface Reader {
    List<String> read(String filename) throws FileNotFoundException;
}

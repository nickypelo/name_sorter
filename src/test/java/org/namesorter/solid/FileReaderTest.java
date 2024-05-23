package org.namesorter.solid;

import org.junit.jupiter.api.Test;

import java.io.FileNotFoundException;
import java.util.List;

import static org.junit.jupiter.api.Assertions.*;

class FileReaderTest {
    @Test
    void testReadFile() throws FileNotFoundException {
        Reader reader = new FileReader();
        List<String> content = reader.read("filename.txt");
        assertFalse(content.isEmpty());
        assertEquals("Janet Parsons", content.get(0));
    }
}

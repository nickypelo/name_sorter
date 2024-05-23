package org.namesorter.solid;

import org.junit.jupiter.api.Test;

import java.io.File;
import java.io.IOException;
import java.nio.file.Files;
import java.util.Arrays;
import java.util.List;

import static org.junit.jupiter.api.Assertions.*;

class FilePrinterTest {
    @Test
    void testPrintToFile() throws IOException {
        Printer printer = new FilePrinter();
        List<String> names = Arrays.asList("John Doe", "Jane Smith", "Alice Johnson");
        printer.print(names);

        File file = new File("sorted-names-list.txt");
        assertTrue(file.exists());
        List<String> content = Files.readAllLines(file.toPath());
        assertEquals(names, content);
    }
}

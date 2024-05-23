package org.namesorter.solid;

import org.junit.jupiter.api.Test;
import org.junit.jupiter.api.io.TempDir;

import java.io.File;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.nio.file.Files;
import java.util.Arrays;
import java.util.List;

import static org.junit.jupiter.api.Assertions.*;

class FileReaderTest {

    @TempDir
    File tempDir;

    @Test
    void testReadFile() throws IOException {
        // Create a temporary file with test data
        File tempFile = new File(tempDir, "filename.txt");
        Files.write(tempFile.toPath(), Arrays.asList("Janet Parsons", "Vaugh Lewis", "Adonis Julius Archer"));

        Reader reader = new FileReader();
        List<String> content = reader.read(tempFile.getAbsolutePath());

        assertFalse(content.isEmpty());
        assertEquals("Janet Parsons", content.get(0));
        assertEquals("Vaugh Lewis", content.get(1));
        assertEquals("Adonis Julius Archer", content.get(2));
    }

    @Test
    void testReadNonexistentFile() {
        Reader reader = new FileReader();
        assertThrows(FileNotFoundException.class, () -> {
            reader.read("nonexistent-file.txt");
        });
    }

    @Test
    void testReadEmptyFile() throws IOException {
        // Create a temporary empty file
        File tempFile = new File(tempDir, "emptyfile.txt");
        tempFile.createNewFile();

        Reader reader = new FileReader();
        List<String> content = reader.read(tempFile.getAbsolutePath());

        assertTrue(content.isEmpty());
    }

}

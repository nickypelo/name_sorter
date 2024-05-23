package org.namesorter.solid.test;

import org.junit.jupiter.api.Test;
import org.namesorter.solid.FileReader;

import java.io.File;
import java.io.FileNotFoundException;
import java.util.ArrayList;
import java.util.List;

import static org.junit.jupiter.api.Assertions.*;

class FileReaderTest {

    @Test
    void readFile_shouldReadContentFromValidFile() throws FileNotFoundException {
        String filename = "filename.txt";
        File testFile = new File(filename);
        FileReader fileReader = new FileReader();

        List<String> content = fileReader.readFile(filename);

        assertTrue(testFile.exists()); // Check if file exists before assertions
        assertEquals(expectedContent(filename), content);
    }

    @Test
    void readFile_shouldThrowFileNotFoundExceptionForNonExistentFile() {
        String filename = "non_existent_file.txt";
        FileReader fileReader = new FileReader();

        assertThrows(FileNotFoundException.class, () -> fileReader.readFile(filename));
    }

    private List<String> expectedContent(String filename) throws FileNotFoundException {
        // Implement logic to read expected content from the test file here
        // This might involve reading the file directly or using a separate helper method
        List<String> expectedLines = new ArrayList<>();
        // ... (Your logic to read expected content)
        return expectedLines;
    }
}

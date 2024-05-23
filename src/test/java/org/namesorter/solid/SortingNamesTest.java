package org.namesorter.solid;

import org.junit.jupiter.api.Test;

import java.util.Arrays;
import java.util.List;
import java.util.ArrayList;
import java.util.Collections;

import static org.junit.jupiter.api.Assertions.*;

class SortingNamesTest {
    @Test
    void testSort() {
        NameSorter sorter = new SortingNames();
        List<String> names = Arrays.asList("Nicholas Peloeahae", "Hannah Farmer", "Themba Mafutya");
        List<String> sortedNames = sorter.sort(names);
        assertEquals(Arrays.asList("Hannah Farmer", "Themba Mafutya", "Nicholas Peloeahae"), sortedNames);
    }

    @Test
    public void testSortEmptyList() {
        SortingNames sorter = new SortingNames();
        List<String> emptyList = new ArrayList<>();
        List<String> sortedList = sorter.sort(emptyList);
        assertTrue(sortedList.isEmpty());
    }

    @Test
    public void testSortSingleName() {
        SortingNames sorter = new SortingNames();
        List<String> names = Collections.singletonList("John Doe");
        List<String> sortedList = sorter.sort(names);
        assertEquals(names, sortedList);
    }

    @Test
    public void testSortMultipleNames() {
        SortingNames sorter = new SortingNames();
        List<String> names = Arrays.asList("Nicholas Peloeahae", "Hannah Farmer", "Themba Mafutya");
        List<String> expectedSortedList = Arrays.asList("Hannah Farmer", "Themba Mafutya", "Nicholas Peloeahae");
        List<String> sortedList = sorter.sort(names);
        assertEquals(expectedSortedList, sortedList);
    }

    @Test
    public void testSortDuplicateLastNames() {
        SortingNames sorter = new SortingNames();
        List<String> names = Arrays.asList("Alice Smith", "Bob Smith", "John Smith", "Jane Doe");
        List<String> expectedSortedList = Arrays.asList("Jane Doe","Alice Smith", "Bob Smith", "John Smith");
        List<String> sortedList = sorter.sort(names);
        assertEquals(expectedSortedList, sortedList);
    }
}

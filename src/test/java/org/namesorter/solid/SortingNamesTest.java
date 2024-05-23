package org.namesorter.solid;

import org.junit.jupiter.api.Test;

import java.util.Arrays;
import java.util.List;
import java.util.ArrayList;
import java.util.Collections;

import static org.junit.jupiter.api.Assertions.*;

class SortingNamesTest {
    @Test
    public void testSortEmptyList() {
        SortingNames sorter = new SortingNames();
        List<String> emptyList = new ArrayList<>();
        List<String> sortedList = sorter.sortByLastName(emptyList);
        assertTrue(sortedList.isEmpty());
    }

    @Test
    public void testSortSingleName() {
        SortingNames sorter = new SortingNames();
        List<String> names = Collections.singletonList("John Doe");
        List<String> sortedList = sorter.sortByLastName(names);
        assertEquals(names, sortedList);
    }

    @Test
    public void testSortMultipleNames() {
        SortingNames sorter = new SortingNames();
        List<String> names = Arrays.asList("Nicholas Peloeahae", "Hannah Farmer", "Themba Mafutya");
        List<String> expectedSortedList = Arrays.asList("Hannah Farmer", "Themba Mafutya", "Nicholas Peloeahae");
        List<String> sortedList = sorter.sortByLastName(names);
        assertEquals(expectedSortedList, sortedList);
    }

    @Test
    public void testSortDuplicateLastNames() {
        SortingNames sorter = new SortingNames();
        List<String> names = Arrays.asList("Nicholas Peloeahae", "Hannah Farmer", "Themba Mafutya", "Mpho Mafutya");
        List<String> expectedSortedList = Arrays.asList("Hannah Farmer", "Mpho Mafutya", "Themba Mafutya", "Nicholas Peloeahae");
        List<String> sortedList = sorter.sortByLastName(names);
        assertEquals(expectedSortedList, sortedList);
    }
}

package org.namesorter.solid.test;

import org.junit.jupiter.api.Test;
import org.namesorter.solid.SortingNames;

import java.util.ArrayList;
import java.util.List;

import static org.junit.jupiter.api.Assertions.*;

class SortingNamesTest {

    @Test
    void sort_shouldSortNamesByLastName() {
        List<String> names = new ArrayList<>();
        names.add("Nicholas Peloeahae");
        names.add("Hannah Farmer");
        names.add("Themba Mafutya");

        SortingNames sortingNames = new SortingNames();
        List<String> sortedNames = sortingNames.sort(names);

        List<String> expectedSortedNames = new ArrayList<>();
        expectedSortedNames.add("Hannah Farmer");
        expectedSortedNames.add("Themba Mafutya");
        expectedSortedNames.add("Nicholas Peloeahae");

        assertEquals(expectedSortedNames, sortedNames);
    }
}

package org.namesorter.solid;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

public class SortingNames implements NameSorter {

    @Override
    public List<String> sort(List<String> names) {
        List<String> lastNames = new ArrayList<>();
        for (String name : names) {
            String[] parts = name.split(" ");
            lastNames.add(parts[parts.length - 1]);
        }
        Collections.sort(lastNames);

        List<String> sortedList = new ArrayList<>();
        for (String lastName : lastNames) {
            for (String name : names) {
                String[] parts = name.split(" ");
                if (lastName.equals(parts[parts.length - 1])) {
                    sortedList.add(name);
                    break; // Exit inner loop once match found
                }
            }
        }
        return sortedList;
    }
}

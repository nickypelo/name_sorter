package org.namesorter.solid;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;
import java.util.HashMap;
import java.util.Map;

public class SortingNames implements NameSorter {

    @Override
    public List<String> sort(List<String> names) {
        Map<String, List<String>> lastNameMap = buildLastNameMap(names);
        List<String> lastNames = new ArrayList<>(lastNameMap.keySet());
        Collections.sort(lastNames);

        List<String> sortedList = new ArrayList<>();
        for (String lastName : lastNames) {
            sortedList.addAll(lastNameMap.get(lastName));
        }
        return sortedList;
    }

    private Map<String, List<String>> buildLastNameMap(List<String> names) {
        Map<String, List<String>> lastNameMap = new HashMap<>();
        for (String name : names) {
            String lastName = extractLastName(name);
            List<String> fullNames = lastNameMap.getOrDefault(lastName, new ArrayList<>());
            fullNames.add(name);
            lastNameMap.put(lastName, fullNames);
        }
        return lastNameMap;
    }

    private String extractLastName(String fullName) {
        String[] parts = fullName.split(" ");
        return parts[parts.length - 1];
    }
}

// idea 1
//public class SortingNames implements NameSorter {
//
//    @Override
//    public List<String> sort(List<String> names) {
//        List<String> lastNames = lastNames(names);
//
//        Collections.sort(lastNames);
//
//        List<String> sortedList = new ArrayList<>();
//        for (String lastName : lastNames) {
//            for (String name : names) {
//                String[] parts = name.split(" ");
//                if (lastName.equals(parts[parts.length - 1])) {
//                    sortedList.add(name);
//                    break;
//                }
//            }
//        }
//        return sortedList;
//    }
//
//    private List<String> lastNames(List<String> names){
//        List<String> lastNames = new ArrayList<>();
//        for (String name : names) {
//            String[] parts = name.split(" ");
//            lastNames.add(parts[parts.length - 1]);
//        }
//        return lastNames;
//    }
//
//}
package org.namesorter.solid;

import java.util.*;

public class SortingNames implements NameSorter {
    /** sorts the names according to lastname.
     * @param names - list of the full names.
     * @return list of sorted names
     * */
    @Override
    public List<String> sortByLastName(List<String> names) {
        Map<String, List<String>> lastNameMap = buildLastNameMap(names);
        List<String> lastNames = new ArrayList<>(lastNameMap.keySet()); // list of the keys
        Collections.sort(lastNames);

        // list to capture the sorted names
        List<String> sortedList = new ArrayList<>();
        for (String lastName : lastNames) {
            List<String> fullNames = lastNameMap.get(lastName);
            Collections.sort(fullNames);  // Sort full names within the same last name
            sortedList.addAll(fullNames);
        }

        return sortedList;
    }

    /** Creates a map.
     * @param names - list of the full names.
     * @return map - keys are lastnames and values are the fullnames.
     * */
    private Map<String, List<String>> buildLastNameMap(List<String> names) {
        Map<String, List<String>> lastNameMap = new HashMap<>();
        for (String name : names) {
            String lastName = extractLastName(name);
            if(!lastName.isEmpty()){
                List<String> fullNames = lastNameMap.getOrDefault(lastName, new ArrayList<>());
                fullNames.add(name);
                lastNameMap.put(lastName, fullNames);
            }
        }
        return lastNameMap;
    }

    /** Extracts lastname from a string.
     * @param fullName (firstnames and lastname).
     * @return lastname string
     * */
    private String extractLastName(String fullName) {
        String[] parts = fullName.split(" ");
        // full name has a max of 4 names: last name and 3 given names
        if((parts.length <=4) && (parts.length >= 2)){
            return parts[parts.length - 1];
        }
        return "";
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
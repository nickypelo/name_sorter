package org.namesorter.solid;

import java.util.List;

public interface NameSorter {
    /** Sorts a list of names by last name.
     *  @param names a List of full names.
     *  @return a List of sorted names.
     */
    List<String> sortByLastName(List<String> names);
}

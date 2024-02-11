package edu.hogwarts.utils;

import edu.hogwarts.model.HogwartsPerson;

import java.util.ArrayList;
import java.util.Comparator;

public class HogwartsPersonUtils {

//    Method to sort an ArrayList of HogwartsPerson.
//    The method mutates the original ArrayList
    public static void sort(ArrayList<HogwartsPerson> personList, SortNameType sortName, boolean isDecending) {
        Comparator<HogwartsPerson> comparator;
        switch (sortName) {
            case SortNameType.FIRST_NAME:
                comparator = Comparator.comparing(HogwartsPerson::getFirstName);
                break;
             case SortNameType.MIDDLE_NAME:
                 comparator = Comparator.comparing(HogwartsPerson::getMiddleName);
                 break;
            case SortNameType.LAST_NAME:
                comparator = Comparator.comparing(HogwartsPerson::getLastName);
                break;
            case SortNameType.AGE:
                comparator = Comparator.comparing(HogwartsPerson::getAge);
                break;
            case SortNameType.HOUSE:
                comparator = Comparator.comparing(HogwartsPerson::getHouse);
                break;
            case SortNameType.ROLE:
                comparator = Comparator.comparing(HogwartsPerson::getRole);
                break;
            default:
                throw new IllegalStateException("Unexpected value: " + sortName);
        }

        if(isDecending) {
            comparator = comparator.reversed();
        }
        // Sorting the list
        personList.sort(comparator);
    }
}

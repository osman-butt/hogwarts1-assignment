package edu.hogwarts.utils;

import edu.generic.RoleType;
import edu.hogwarts.model.HogwartsPerson;

import java.util.ArrayList;
import java.util.Comparator;
import java.util.List;
import java.util.stream.Collectors;

public class HogwartsPersonUtils {

//    Method to sort a List of HogwartsPerson.
//    The method mutates the original List
    public static void sort(List<HogwartsPerson> personList, SortNameType sortName, boolean isDecending) {
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

//    Method to filter a List of HogwartsPerson on HouseType and RoleType.
//    The method does not mutate the original List
    public static List<HogwartsPerson> filter(List<HogwartsPerson> personList, HouseType house, RoleType role) {
        if(house != null && role == null) {
            return filter(personList,house);
        }
        if (house == null && role != null) {
            return filter(personList,role);
        }
        return personList.stream().filter(person -> person.getHouse().toString().equals(house.toString()) && person.getRole().toString().equals(role.toString())).collect(Collectors.toList());
    }

//    Method to filter a List of HogwartsPerson on HouseType.
//    The method does not mutate the original List
    public static List<HogwartsPerson> filter(List<HogwartsPerson> personList, HouseType house) {
        return personList.stream().filter(person -> person.getHouse().toString().equals(house.toString())).collect(Collectors.toList());
    }

//    Method to filter a List of HogwartsPerson on RoleType.
//    The method does not mutate the original List
    public static List<HogwartsPerson> filter(List<HogwartsPerson> personList, RoleType role) {
        return personList.stream().filter(person -> person.getRole().toString().equals(role.toString())).collect(Collectors.toList());
    }
}

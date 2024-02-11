package edu.hogwarts.view;

import edu.generic.RoleType;
import edu.hogwarts.controller.StudentController;
import edu.hogwarts.controller.TeacherController;
import edu.hogwarts.model.HogwartsPerson;
import edu.hogwarts.utils.HogwartsPersonUtils;
import edu.hogwarts.utils.HouseType;
import edu.hogwarts.utils.SortNameType;
import org.jetbrains.annotations.NotNull;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class UserInterface {
    private final StudentController studentController;
    private final TeacherController teacherController;

    public UserInterface(@NotNull StudentController studentController, @NotNull TeacherController teacherController){
        this.studentController = studentController;
        this.teacherController = teacherController;
    }

    public void start() {
        System.out.println("+---------------------------+");
        System.out.println("| Welcome to Hogwarts admin |");
        System.out.println("+---------------------------+");

        while (true) {
            switch (mainMenu()) {
                case 0 -> System.exit(0);
                case 1 -> sortList(SortNameType.FIRST_NAME,false);
                case 2 -> sortMenu();
                case 3 -> filterMenu();
            }
        }
    }

    private int getInputChoice(int lowestChoice, int highestChoice) {
        Scanner input = new Scanner(System.in);
        System.out.print("Choose from the list " + lowestChoice +"-"+highestChoice + ": ");
        int choice = input.nextInt();
        while (choice < lowestChoice || choice > highestChoice) {
            System.out.print("Please enter a value between " + lowestChoice +"-"+highestChoice + ": ");
            choice = input.nextInt();
        }
        return choice;
    }
    public int mainMenu() {
        System.out.println("##### MAIN MENU #####");
        System.out.println("1: Show all students & teachers");
        System.out.println("2: Show sorted list");
        System.out.println("3: Show filtered list");
        System.out.println("0: Exit");
        return getInputChoice(0,3);
    }

    private void sortMenu() {
        System.out.println("##### SORT MENU #####");
        System.out.println("1: Sort by first name");
        System.out.println("2: Sort by middle name");
        System.out.println("3: Sort by last name");
        System.out.println("4: Sort by house");
        System.out.println("5: Sort by age");
        System.out.println("6: Sort by role");
        System.out.println("0: Main menu");
        int choice = getInputChoice(0,6);
        if (choice > 0) {
            Scanner input = new Scanner(System.in);
            System.out.print("Do you want the list to be sorted decending (yes/no):");
            String descending = input.nextLine();
            boolean isDescending = descending.equalsIgnoreCase("yes");
            switch (choice) {
                case 1:
                    sortList(SortNameType.FIRST_NAME,isDescending);
                    break;
                case 2:
                    sortList(SortNameType.MIDDLE_NAME,isDescending);
                    break;
                case 3:
                    sortList(SortNameType.LAST_NAME,isDescending);
                    break;
                case 4:
                    sortList(SortNameType.HOUSE,isDescending);
                    break;
                case 5:
                    sortList(SortNameType.AGE,isDescending);
                    break;
                case 6:
                    sortList(SortNameType.ROLE,isDescending);
                    break;
            }
        }
    }

    private void filterMenu() {
        // List of available menu items
        HouseType[] HOUSE_TYPES = {HouseType.GRYFFINDOR,HouseType.HUFFLEPUFF,HouseType.RAVENCLAW,HouseType.SLYTHERIN};
        RoleType[] ROLE_TYPES = {RoleType.STUDENT,RoleType.TEACHER};

        // Get filtered house
        System.out.println("##### FILTER BY HOUSE #####");
        System.out.println("1: GRYFFINDOR");
        System.out.println("2: HUFFLEPUFF");
        System.out.println("3: RAVENCLAW");
        System.out.println("4: SLYTHERIN");
        System.out.println("5: Show all houses");
        System.out.println("0: Main menu");
        int choiceHouse = getInputChoice(0,5);
        if (choiceHouse == 0) {return;}
        HouseType houseType;
        if (choiceHouse != 5) {
            houseType = HOUSE_TYPES[(choiceHouse-1)];
        } else {
            houseType = null;
        }

        // Get filtered role
        System.out.println("##### FILTER BY ROLE #####");
        System.out.println("1: STUDENT");
        System.out.println("2: TEACHER");
        System.out.println("3: Show all roles");
         System.out.println("0: Main menu");
        int choiceRole = getInputChoice(0,3);
        if (choiceRole == 0) {return;}
        RoleType roleType;
        if (choiceRole != 3) {
            roleType = ROLE_TYPES[(choiceRole - 1)];
        } else {
            roleType = null;
        }

        // Filter list
        filterList(houseType,roleType);
    }

    private void table(List<HogwartsPerson> list) {
        String TABLE_FORMAT = "| %-15s | %-22s | %-15s | %-12s | %-7d | %-10s |%n";
        String ROW_SEP = "+-----------------+------------------------+-----------------+--------------+---------+------------+%n";

        // TABLE HEADER
        System.out.format(ROW_SEP);
        System.out.format("| First name (1)  | Middle name (2)        | Last name (3)   | House (4)    | Age (5) | Role (6)   |%n");
        System.out.format(ROW_SEP);

        // TABLE ROWS
        for (HogwartsPerson person : list) {
            System.out.format(TABLE_FORMAT, person.getFirstName(), person.getMiddleName(), person.getLastName(), person.getHouse(), person.getAge(), person.getRole());
        }
        System.out.format(ROW_SEP);
    }

    private void sortList(SortNameType sortName, boolean isDescending) {
        // GET LISTS
        List<HogwartsPerson> listSorted = new ArrayList<>(teacherController.getAll());
        listSorted.addAll(studentController.getAll());
        HogwartsPersonUtils.sort(listSorted,sortName,isDescending);
        // Display table
        System.out.println();
        String directionMsg = isDescending ? "desc" : "asc";
        System.out.println("Table sorted by " + sortName.toString() + " (" + directionMsg + ")");
        table(listSorted);
    }

    private void filterList(HouseType house, RoleType role) {
        // GET LISTS
        List<HogwartsPerson> list = new ArrayList<>(teacherController.getAll());
        list.addAll(studentController.getAll());
        List<HogwartsPerson> listFiltered = HogwartsPersonUtils.filter(list,house,role);
        // Display table
        System.out.println();
        StringBuilder filterMessage = new StringBuilder();
        filterMessage.append("Table filtered by ");
        if (house != null) {
            filterMessage.append(house.toString());
        };
        if (role != null) {
            filterMessage.append(" ");
            filterMessage.append(role.toString());
        }
        System.out.println(filterMessage);
        table(listFiltered);
    }
}

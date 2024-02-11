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

    private final HouseType[] houseTypes = {HouseType.GRYFFINDOR,HouseType.HUFFLEPUFF,HouseType.RAVENCLAW,HouseType.SLYTHERIN};
    private final RoleType[] roleTypes = {RoleType.STUDENT,RoleType.TEACHER};

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

    public int mainMenu() {
        System.out.println("##### MAIN MENU #####");
        System.out.println("1: Show all students & teachers");
        System.out.println("2: Show sorted list");
        System.out.println("3: Show filtered list");
        System.out.println("0: Exit");
        Scanner input = new Scanner(System.in);
        System.out.print("Choose from the list 0-3: ");
        int choice = input.nextInt();
        while (choice < 0 || choice > 3) {
            System.out.print("Please enter a value between 0-3: ");
            choice = input.nextInt();
        }
        return choice;
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
        Scanner input = new Scanner(System.in);
        System.out.print("Choose from the list 0-6: ");
        int choice = input.nextInt();
        while (choice < 0 || choice > 6) {
            System.out.print("Please enter a value between 0-6: ");
            choice = input.nextInt();
        }
        if (choice > 0) {
            Scanner input2 = new Scanner(System.in);
            System.out.print("Do you want the list to be sorted decending (yes/no):");
            String descending = input2.nextLine();
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
        System.out.println("##### FILTER BY HOUSE #####");
        System.out.println("1: GRYFFINDOR");
        System.out.println("2: HUFFLEPUFF");
        System.out.println("3: RAVENCLAW");
        System.out.println("4: SLYTHERIN");
        System.out.println("5: Show all houses");
        System.out.println("0: Main menu");
        Scanner input = new Scanner(System.in);
        System.out.print("Choose from the list 0-5: ");
        int choiceHouse = input.nextInt();
        while (choiceHouse < 0 || choiceHouse > 5) {
            System.out.print("Please enter a value between 0-5: ");
            choiceHouse = input.nextInt();
        }
        if (choiceHouse == 0) {return;}
        System.out.println("##### FILTER BY ROLE #####");
        System.out.println("1: STUDENT");
        System.out.println("2: TEACHER");
        System.out.println("3: Show all roles");
         System.out.println("0: Main menu");
        Scanner input2 = new Scanner(System.in);
        System.out.print("Choose from the list 0-3: ");
        int choiceRole = input2.nextInt();
        while (choiceRole < 0 || choiceRole > 3) {
            System.out.print("Please enter a value between 0-3: ");
            choiceRole = input.nextInt();
        }
        if (choiceRole == 0) {return;}
        HouseType houseType;
        if (choiceHouse != 5) {
            houseType = houseTypes[(choiceHouse-1)];
        } else {
            houseType = null;
        }
        RoleType roleType;
        if (choiceRole != 3) {
            roleType = roleTypes[(choiceRole - 1)];
        } else {
            roleType = null;
        }
        filterList(houseType,roleType);
    }

    private void sortList(SortNameType sortName, boolean isDescending) {
        String TABLE_FORMAT = "| %-15s | %-15s | %-15s | %-12s | %-7d | %-10s |%n";
        String ROW_SEP = "+-----------------+-----------------+-----------------+--------------+---------+------------+%n";

        // TABLE HEADER
        System.out.format(ROW_SEP);
        System.out.format("| First name (1)  | Middle name (2) | Last name (3)   | House (4)    | Age (5) | Role (6)   |%n");
        System.out.format(ROW_SEP);

        // GET LISTS
        List<HogwartsPerson> listSorted = new ArrayList<>(teacherController.getAll());
        listSorted.addAll(studentController.getAll());
        HogwartsPersonUtils.sort(listSorted,sortName,isDescending);

        // TABLE ROWS
        for (HogwartsPerson person : listSorted) {
            System.out.format(TABLE_FORMAT, person.getFirstName(), person.getMiddleName(), person.getLastName(), person.getHouse(), person.getAge(), person.getRole());
        }
        System.out.format(ROW_SEP);
    }

    private void filterList(HouseType house, RoleType role) {
        String TABLE_FORMAT = "| %-15s | %-15s | %-15s | %-12s | %-7d | %-10s |%n";
        String ROW_SEP = "+-----------------+-----------------+-----------------+--------------+---------+------------+%n";

        // TABLE HEADER
        System.out.format(ROW_SEP);
        System.out.format("| First name (1)  | Middle name (2) | Last name (3)   | House (4)    | Age (5) | Role (6)   |%n");
        System.out.format(ROW_SEP);

        // GET LISTS
        List<HogwartsPerson> list = new ArrayList<>(teacherController.getAll());
        list.addAll(studentController.getAll());
        var listFiltered = HogwartsPersonUtils.filter(list,house,role);

        // TABLE ROWS
        for (HogwartsPerson person : listFiltered) {
            System.out.format(TABLE_FORMAT, person.getFirstName(), person.getMiddleName(), person.getLastName(), person.getHouse(), person.getAge(), person.getRole());
        }
        System.out.format(ROW_SEP);
    }
}

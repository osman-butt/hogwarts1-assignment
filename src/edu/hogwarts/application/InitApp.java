package edu.hogwarts.application;

import edu.hogwarts.controller.StudentController;
import edu.hogwarts.controller.TeacherController;
import edu.hogwarts.model.*;
import edu.hogwarts.utils.HouseType;
import org.jetbrains.annotations.NotNull;

import java.time.LocalDate;

public class InitApp {
    private final StudentController studentController;
    private final TeacherController teacherController;
    public InitApp(@NotNull StudentController studentController, @NotNull TeacherController teacherController) {
        this.studentController = studentController;
        this.teacherController = teacherController;
    }

    public void initData() {
        initStudentsData();
        initTeachersData();
    }

    private void initStudentsData() {
        // Create House
        House gryffindor = new House(HouseType.GRYFFINDOR,"Godric Gryffindor", new String[]{"Red","Yellow"});
        House ravenclaw = new House(HouseType.RAVENCLAW,"Rowena Ravenclaw",new String[]{"Blue","Bronze"});
        House slytherin = new House(HouseType.SLYTHERIN,"Salazar Slytherin",new String[]{"Green","Silver"} );
        House hufflepuff = new House(HouseType.HUFFLEPUFF,"Helga Hufflepuff",new String[]{"Yellow","Black"} );
        // Create Hogwarts students
        studentController.create(new HogwartsStudent("Harry James Potter","1980-01-01",1991,0,false,gryffindor,false,null));
        studentController.create(new HogwartsStudent("Ron Weasley","1981-02-12",1991,0,false,gryffindor,false,null));
        studentController.create(new HogwartsStudent("Hermione Granger","1981-01-23",1991,1999,true,gryffindor,true,null));
        studentController.create(new HogwartsStudent("Padma Patil","1979-08-19",1991,1998,true,ravenclaw,true,null));
        studentController.create(new HogwartsStudent("Draco Malfoy","1979-09-11",1991,1998,true,slytherin,true,null));
        studentController.create(new HogwartsStudent("Vincent Crabbe","1980-03-21",1991,0,false,slytherin,true,null));
        studentController.create(new HogwartsStudent("Gregory Goyle","1981-06-22",1991,1998,true,slytherin,true,null));
        studentController.create(new HogwartsStudent("Justin Finch-Fletchley","1981-01-27",1991,1998,true,hufflepuff,false,null));
        studentController.create(new HogwartsStudent("Seamus Finnigan","1979-11-01",1991,1998,true,gryffindor,false,null));
        studentController.create(new HogwartsStudent("Neville Longbottom","1980-01-09",1991,1998,true,gryffindor,false,null));
        studentController.create(new HogwartsStudent("Parvati Patil","1980-06-06",1991,1998,true,gryffindor,true,null));
        studentController.create(new HogwartsStudent("Pansy Parkinson","1980-07-04",1991,1998,true,slytherin,true,null));
    }

    private void initTeachersData() {
        // Create House
//        House gryffindor = new House("Gryffindor","Godric Gryffindor", new String[]{"Red","Yellow"});
//        House ravenclaw = new House("Ravenclaw","Rowena Ravenclaw",new String[]{"Blue","Bronze"});
        House slytherin = new House(HouseType.SLYTHERIN,"Salazar Slytherin",new String[]{"Green","Silver"} );
//        House hufflepuff = new House("Hufflepuff","Helga Hufflepuff",new String[]{"Yellow","Black"} );
        // Create Hogwarts Teacher
        teacherController.create(new HogwartsTeacher("Horace Slughorn","1949-07-26", EmpType.PROFESSOR, LocalDate.parse("1985-01-01"),LocalDate.parse("2000-01-01"),slytherin,true));
        teacherController.create(new HogwartsTeacher("Severus Snape","1946-06-29",EmpType.PROFESSOR, LocalDate.parse("1980-01-01"),LocalDate.parse("2005-01-01"),slytherin,false));

    }

//    public void initCourseData() {
//        // Subjects
//        Subject potions = new Subject("Potions", 6,false);
//
//        // Teaching materials
//        TextBook advancedPotionsMaking = new TextBook("Advanced Potion-Making",true,true,false,"Libatius Borage","Merge Books",1946);
//        Tool cauldron = new Tool("Cauldron", false, true,true,null);
//        Tool spoon = new Tool("Silver spoon", false, true,true,null);
//        Ingredient shrivelfig = new Ingredient("Shrivelfig", true, true,false, 1,"Leaves");
//        Ingredient porcupineQuills = new Ingredient("Porcupine quills", true, false,true, 2,"Spines");
//        Ingredient peppermint = new Ingredient("Peppermint", true, true,false, 1,"Leaves");
//        Ingredient sopophorousBean = new Ingredient("Sopophorous Bean", true, false,true, 1,"Pieces");
//        Ingredient wormwood = new Ingredient("Infusion of wormwood", true, false,true, 10,"ml");
//
//        TeachingMaterial[] potionsMaterial = new TeachingMaterial[]{advancedPotionsMaking,cauldron,spoon,shrivelfig,porcupineQuills,peppermint,sopophorousBean,wormwood};
//
//
//        Course potionsCourse = new Course(potions,slughorn, students, potionsMaterial);
//    }
}

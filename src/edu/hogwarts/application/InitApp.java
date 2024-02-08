package edu.hogwarts.application;

import edu.hogwarts.model.*;

import java.time.LocalDate;

public class InitApp {
    public InitApp() {}

    public void initData() {
        initStudentsData();
        initTeachersData();
    }

    private void initStudentsData() {
        // Create House
        House gryffindor = new House("Gryffindor","Godric Gryffindor", new String[]{"Red","Yellow"});
        House ravenclaw = new House("Ravenclaw","Rowena Ravenclaw",new String[]{"Blue","Bronze"});
        House slytherin = new House("Slytherin","Salazar Slytherin",new String[]{"Green","Silver"} );
        House hufflepuff = new House("Hufflepuff","Helga Hufflepuff",new String[]{"Yellow","Black"} );
        // Create Hogwarts students
        HogwartsStudent harry = new HogwartsStudent("Harry Potter",1991,0,false,gryffindor,false,null);
        HogwartsStudent ron = new HogwartsStudent("Ron Weasley",1991,0,false,gryffindor,false,null);
        HogwartsStudent hermione = new HogwartsStudent("Hermione Granger",1991,1999,true,gryffindor,true,null);
        HogwartsStudent padma = new HogwartsStudent("Padma Patil",1991,1998,true,ravenclaw,true,null);
        HogwartsStudent draco = new HogwartsStudent("Draco Malfoy",1991,1998,true,slytherin,true,null);
        HogwartsStudent crabbe = new HogwartsStudent("Vincent Crabbe",1991,0,false,slytherin,true,null);
        HogwartsStudent goyle = new HogwartsStudent("Gregory Goyle",1991,1998,true,slytherin,true,null);
        HogwartsStudent justin = new HogwartsStudent("Justin Finch-Fletchley",1991,1998,true,hufflepuff,false,null);
        HogwartsStudent seamus = new HogwartsStudent("Seamus Finnigan",1991,1998,true,gryffindor,false,null);
        HogwartsStudent neville = new HogwartsStudent("Neville Longbottom",1991,1998,true,gryffindor,false,null);
        HogwartsStudent parvati = new HogwartsStudent("Parvati Patil",1991,1998,true,gryffindor,true,null);
        HogwartsStudent pansy = new HogwartsStudent("Pansy Parkinson",1991,1998,true,slytherin,true,null);
    }

    private void initTeachersData() {
        // Create House
//        House gryffindor = new House("Gryffindor","Godric Gryffindor", new String[]{"Red","Yellow"});
//        House ravenclaw = new House("Ravenclaw","Rowena Ravenclaw",new String[]{"Blue","Bronze"});
        House slytherin = new House("Slytherin","Salazar Slytherin",new String[]{"Green","Silver"} );
//        House hufflepuff = new House("Hufflepuff","Helga Hufflepuff",new String[]{"Yellow","Black"} );
        // Create Hogwarts Teacher
        HogwartsTeacher slughorn = new HogwartsTeacher("Horace Slughorn", EmpType.PROFESSOR, LocalDate.parse("1985-01-01"),LocalDate.parse("2000-01-01"),slytherin,true);
        HogwartsTeacher snape = new HogwartsTeacher("Severus Snape",EmpType.PROFESSOR, LocalDate.parse("1980-01-01"),LocalDate.parse("2005-01-01"),slytherin,false);

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

import edu.hogwarts.*;

import java.time.LocalDate;

public class Main {
    private HogwartsStudent[] students;
    private House[] houses;
    private HogwartsTeacher[] teachers;

    public static void main(String[] args) {
        Main app = new Main();
        app.initApp(); // generate instances w/hard coded data
        System.out.println("Number of houses: "+app.houses.length);
        System.out.println("Number of students: "+app.students.length);
        System.out.println("Number of teachers: "+app.teachers.length);
    }

    public void initApp() {
        // Create House
        House gryffindor = new House("Gryffindor","Godric Gryffindor", new String[]{"Red","Yellow"});
        House ravenclaw = new House("Ravenclaw","Rowena Ravenclaw",new String[]{"Blue","Bronze"});
        House slytherin = new House("Slytherin","Salazar Slytherin",new String[]{"Green","Silver"} );
        House hufflepuff = new House("Hufflepuff","Helga Hufflepuff",new String[]{"Yellow","Black"} );
        // Add to array
        houses = new House[]{gryffindor,ravenclaw,slytherin,hufflepuff};

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
        // Add to array
        students = new HogwartsStudent[]{harry,ron,hermione,padma,draco,crabbe,goyle,justin,seamus,neville,parvati,pansy};

        // Create Hogwarts Teacher
        HogwartsTeacher slughorn = new HogwartsTeacher("Horace Slughorn",EmpType.PROFESSOR, LocalDate.parse("1985-01-01"),LocalDate.parse("2000-01-01"),slytherin,true);
        HogwartsTeacher snape = new HogwartsTeacher("Severus Snape",EmpType.PROFESSOR, LocalDate.parse("1980-01-01"),LocalDate.parse("2005-01-01"),slytherin,false);
        // add to array
        teachers = new HogwartsTeacher[]{slughorn,snape};

    }
}
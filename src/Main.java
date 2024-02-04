import edu.hogwarts.Person;
import edu.hogwarts.Student;

public class Main {
    public static void main(String[] args) {
        Person person = new Person("Harry Potter");
        Student student = new Student(person,2020,2022);
    }
}
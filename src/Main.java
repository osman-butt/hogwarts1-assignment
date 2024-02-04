import edu.hogwarts.Person;

public class Main {
    public static void main(String[] args) {
        //TIP Press <shortcut actionId="ShowIntentionActions"/> with your caret at the highlighted text
        // to see how IntelliJ IDEA suggests fixing it.
        Person person = new Person("Harry Potter");

        System.out.println(person.getFullName());
    }
}

import java.util.*;

public class W2A4Tajolosa {

    public static void main(String[] args) {

        ArrayList<String> students = new ArrayList<>();

        students.add("Trixie");
        students.add("Briel");
        students.add("Carlo");

        System.out.println("Student List: ");

        for(int i=0; i<students.size(); i++) {
            System.out.println((i+1) + ". " + students.get(i));
        }

        students.set(1, "Bini");
        System.out.println("\nAfter updating: ");
        System.out.println(students);

        System.out.println("\nIs Carlo in the list? " + students.contains("Carlo"));
    }
}

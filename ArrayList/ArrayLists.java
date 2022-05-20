package ArrayList;
import java.util.ArrayList;
import java.util.Scanner;

public class ArrayLists {
    public static void main(String[] args) {

        ArrayList<String> Names = new ArrayList<>();
        ArrayList<Integer> Age = new ArrayList<>();
        Scanner inputNames = new Scanner(System.in);
        Scanner inputAge = new Scanner(System.in);

        String names;
        int newValue;

        Names.add("Jonel");
        Names.add("Mark");
        Names.add("Elon");
        Names.add("Steve");

        for(String name : Names){
            System.out.println(name);
        }
        System.out.print(" Enter a name to remove in the lists: ");
        names = inputNames.nextLine();

        Names.remove(names);

        for(String newNames : Names){
            System.out.println(newNames);
        }

        Age.add(21);
        Age.add(46);
        Age.add(36);
        Age.add(76);

        for(int age : Age){
            System.out.println(age);
        }

        System.out.print(" Enter a value to remove in the lists: ");
        newValue = inputAge.nextInt();

        Age.remove(Integer.valueOf(newValue));

        for(int newAges : Age){
            System.out.println(newAges);
        }
    }
}
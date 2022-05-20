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
        int ages;

        Names.add("Jonel");
        Names.add("Mark");
        Names.add("Elon");
        Names.add("Steve");


        for(String name : Names){
            System.out.println(name);
        }

        Age.add(21);
        Age.add(46);
        Age.add(36);
        Age.add(76);

        for(int age : Age){
            System.out.println(age);
        }
    }
}
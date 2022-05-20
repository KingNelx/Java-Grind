package ArrayList;

import java.util.Scanner;
import java.util.ArrayList;

public class ArrayLists{
    public static void main (String[]args){
        Scanner input = new Scanner(System.in);
        ArrayList<String>emp = new ArrayList<>();
        String names;
        int count;

        System.out.println(" How many Employees you have?: ");
        count = input.nextInt();

        for(int i = 1; i <= count; i++){
            System.out.println(" Enter name: ");
            names = input.nextLine();
            emp.add(names);
        }
        System.out.println(emp);
    }

}
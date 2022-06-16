package Collections;
import java.util.ArrayList;
import java.util.LinkedList;
import java.util.List;

public class myList {
    public static void main (String[]args){
        // Arraylist implementation
        List<String>list1 = new ArrayList<>();
        list1.add("Jonel");
        list1.add("Tapia");
        list1.add("Pogi");

        // LinkedList implementation
        List<String>list2 = new LinkedList<>();
        list2.add("King");
        list2.add("Nel");
        list2.add("Awesome");

        // Another list
        List<String>s3 = new ArrayList<>();
        s3.add("Invoker");
        s3.add("Tinker");
        s3.add("Monkey King");

        System.out.println(s3);
        // change elements of lists
        list1.set(2, "Very pogi");
        list1.get(1);
        // combining lists
        list1.addAll(list2);

        for(String combineList : list1){
            System.out.println(combineList);
        }

    }
}

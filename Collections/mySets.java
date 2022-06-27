package Collections;
import java.util.HashSet;
import java.util.Set;


public class mySets {
    public static void main (String[]args){
        // Set interface don't accept duplicate elements
        Set<String> set = new HashSet<>();
        set.add("Invoker");
        set.add("Tinker");
        set.add("Monkey King");

        System.out.println(set);
    }
}

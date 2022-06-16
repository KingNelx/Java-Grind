package Collections;
import java.util.HashSet;
import java.util.Set;
import java.util.ArrayList;

public class mySets {
    public static void main (String[]args){
        Set<String> set = new HashSet<String>();
        set.add("Invoker");
        set.add("Tinker");
        set.add("Invoker");

        System.out.println(set);
    }
}

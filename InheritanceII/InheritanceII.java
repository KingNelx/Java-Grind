package InheritanceII;

public class InheritanceII {
    public static void main (String[]args){
        Parent s1 = new Parent();
        Child s2 = new Child();

        s1.name = "Jonel";
        s1.myAge(22);
        s1.printData();
        s2.printData();
        s2.myAge(21);
    }
}
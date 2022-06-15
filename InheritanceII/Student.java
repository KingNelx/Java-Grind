package InheritanceII;

public class Student {
    public void printInfo(Class s1, String myName, int rate){
        s1.setName(myName);
        s1.setRate(rate);
        System.out.println(s1.getName());
        System.out.println(s1.getRate());
    }
}

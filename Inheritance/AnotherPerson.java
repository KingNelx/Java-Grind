package Inheritance;

public class AnotherPerson extends Person{
    @Override

    public void printData() {
        super.printData();
        System.out.println(" My name is: " + getName());
    }
}

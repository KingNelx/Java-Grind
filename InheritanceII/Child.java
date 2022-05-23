package InheritanceII;

public class Child extends  Parent{

    String name = "KingNel";

    @Override
    public void printData(){
        System.out.println("The name is: " + name);
    }

    @Override
    public void myAge(int age){
        super.myAge(age);
    }


}

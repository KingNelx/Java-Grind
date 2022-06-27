package OOPExercise;

 abstract class Shape1{
    abstract void show1();
}

class Circle1 extends Shape1 {
    @Override
    void show1(){
        System.out.println(" This is an abstract method (Circle) ");
    }
}


class Rectangle1 extends Shape1{
    @Override
    void show1(){
        System.out.println(" This is an abstract method (Rectangle) ");
    }
}

public class Lab2 {
    public static void main (String[]args){
        Circle1 s1 = new Circle1();
        Rectangle1 s2 = new Rectangle1();

        s1.show1();
        s2.show1();


    }
}

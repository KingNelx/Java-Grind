package OOPExercise;

abstract class myShape{
    int n1;
    int n2;


    abstract void printArea();
}

class testRectangle extends myShape{

    @Override
    void printArea() {
        n1 = 5;
        n2 = 3;
        int s = n1 * n2;
        System.out.println(s);
    }
}

class testTriangle extends myShape{
    @Override
    void printArea() {
        n1 = 5;
        n2 = 3;
        int s = n1 / n2;
        System.out.println(s);
    }
}

class testCircle extends myShape{
    @Override
    void printArea() {
        n1 = 5;
        n2 = 3;
        int s = n1 + n2;
        System.out.println(s);
    }
}

public class Lab6 {
    public static void main (String[]args) {
        testCircle s1 = new testCircle();
        testRectangle s2 = new testRectangle();
        testTriangle s3 = new testTriangle();

        s1.printArea();
        s2.printArea();
        s3.printArea();
    }
}

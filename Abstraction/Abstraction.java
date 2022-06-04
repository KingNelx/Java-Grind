package Abstraction;

public class Abstraction {
    public static void main (String[]args){

        Test1 s1 = new Test1();
        Test2 s2 = new Test2();
        Test3 s3 = new Test3();
        Test4 s4 = new Test4();

        s1.setTitle(" Title ");
        s1.setPassingScore(90);
        s1.printData();
        s1.checkScore(89);
    }
}

package Abstraction;

public class Abstraction {
    public static void main (String[]args){

        Test1 s1 = new Test1();
        Test2 s2 = new Test2();


        s1.setTitle(" Title ");
        s1.setPassingScore(90);
        s1.printData();
        s1.checkScore(89);

        s2.printData();
    }
}

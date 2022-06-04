package Abstraction;

 interface s1{
    public void testMethod();
}

abstract class s2 {
    public abstract void anotherTest();
}
class test implements s1{

    @Override
    public void testMethod() {

    }
}

class tet2 extends s2 {
    @Override
    public void anotherTest(){
        System.out.println(" Hi There ");
    }
}
public class Abstraction {
    public static void main (String[]args){

    }
}

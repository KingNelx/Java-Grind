package Protected;

public class Test1 {
    protected String name = "Test Jonel Pogi";
    public void test(){
        System.out.println("Test");
    }
}

class Test2 extends Test1{
    public void print(){
        System.out.println(name);
    }
}

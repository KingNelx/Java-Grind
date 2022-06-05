package AbstractionII;

public class TestII {
    public static void main (String[]args){
        CEO ceo = new CEO();
        ceo.printData();
        Employee s1 = new Employee();

        s1.empInfo(new CEO(), " Elon Musk ", " Business man ", " Tesla ");
    }
}

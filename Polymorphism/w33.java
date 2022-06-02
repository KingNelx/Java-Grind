package Polymorphism;

public class w33 extends Players{
    @Override

    public void greetings(){
        System.out.println(" Hi im w33 ");
    }

    @Override
    public void details(String address, String company){
        System.out.println(" Address is: " + address);
        System.out.println(" Company is: " + company);
    }
}

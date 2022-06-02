package Polymorphism;

public class Miracle extends Players{


    @Override
    public void greetings(){
        System.out.println(" Hi im Miracle ");
    }

    @Override
    public void details(String Hero, String laning){
        System.out.println(" My favorite Hero is: " + Hero);
        System.out.println(" My Lane is: " + laning);
    }
}

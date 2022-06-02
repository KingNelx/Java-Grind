package Polymorphism;

public class Polymorphism {
    public static void main (String[]args){
        Players player = new Players();
        Miracle p1 = new Miracle();
        w33 p2 = new w33();

        player.greetings();
        player.details("Support", "No Team");
        p1.greetings();
        p1.details("Invoker", "Mid lane");
        p2.greetings();
        p2.details("Europe" ,"Alliance");
    }
}
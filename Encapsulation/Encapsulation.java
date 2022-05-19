package Encapsulation;
import java.util.ArrayList;
import java.util.Scanner;

class Business{
    private String name;
    private String location;
    private String type;
    private ArrayList<String>partner;

    public void setPartner(ArrayList<String> partner) {
        this.partner = partner;
    }

    public ArrayList<String> getPartner() {
        return partner;
    }
}

class Partners{

}
public class Encapsulation {
    public static void main (String[]args){
        Scanner input = new Scanner(System.in);
        Business s1 = new Business();
        ArrayList<String>s2 = new ArrayList<>();
        s2.add("King Nel");
        s2.add(" Invo ");

        s1.setPartner(s2);
        System.out.println(s1.getPartner());
    }
}

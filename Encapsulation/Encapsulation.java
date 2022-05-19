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
        int count = 0;
        String partner;
        System.out.print(" How many Business partners you have?: ");
        int partners = input.nextInt();

        for(int index = 0; index < partners; index++){
            System.out.println(" Indicate your partners ");
            System.out.print("Partner no." + count +": " );
            partner = input.nextLine();
            s2.add(partner);

        }

        System.out.println(s2);
    }
}

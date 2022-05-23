package Inheritance;

import java.util.Scanner;

public class GatherInfo {
    private Scanner input = new Scanner(System.in);

    public String Name;
    public int Age;
    public String Company;
    public String Position;
    public double Salary;

    public void gatherData(){
        System.out.print(" Enter your name: ");
        Name = input.nextLine();
        System.out.print(" Enter your age: ");
        Age = input.nextInt();
        input.nextLine();
        System.out.print(" Enter your company: ");
        Company = input.nextLine();
        System.out.print(" Enter your position: ");
        Position = input.nextLine();
        System.out.print(" Enter your salary: ");
        Salary = input.nextDouble();
    }

    GatherInfo(){
        gatherData();
    }
}

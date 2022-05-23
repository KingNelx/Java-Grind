package Inheritance;

import java.util.Locale;

public class Developer {
    private String Name;
    private int Age;
    private int YrsOfExperience;
    private String Position;
    private String Company;
    private double Salary;

    public void setPosition(String Position){
        if(Position.equals("senior")) {
            System.out.println(" You are a senior");
            Salary = Salary + 500;
        }
        this.Position = Position;
    }

    public String getPosition(){
        return Position;
    }
    public void setSalary(double Salary){
        this.Salary = Salary;
    }

    public double getSalary(){
        return Salary;
    }

    public void checkPosition(){
//        if(Position.equals("senior")){
//            System.out.println(" You are a senior");
//            Salary = Salary + 500;
//            System.out.println(getSalary());
//        }
        System.out.println(getPosition().toLowerCase(Locale.ROOT));
        System.out.println(getSalary());
    }
}

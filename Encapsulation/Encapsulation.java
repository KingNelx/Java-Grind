package Encapsulation;
import java.util.ArrayList;

class Game{
    private String Name;
    private String Developer;
    private String Owner;
    private String Company;
    private String Genre;
    private String OnlineOrOffline;
    private String Reviews;
    private double Cost;
    private int Rating;
    private int Duration;

    public void setName(String name){
        this.Name = name;
    }

    public String getName(){
        return Name;
    }

    public void setDeveloper(String Developer){
        this.Developer = Developer;
    }

    public String getDeveloper(){
        return Developer;
    }

    public void setOwner(){

    }
}

class Manager{
    String ManagerName;
}

public class Encapsulation{
    public static void main (String[]args){

    }
}
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

    public void setName(String Name){
        this.Name = Name;
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

    public void setOwner(String Owner){
        this.Owner = Owner;
    }

    public String getOwner(){
        return Owner;
    }

    public void setCompany(String Company){
        this.Company = Company;
    }

    public String getCompany(){
        return Company;
    }

    public void setGenre(String Genre){
        this.Genre = Genre;
    }

    public String getGenre(){
        return Genre;
    }

    public void setOnlineOrOffline(String OnlineOrOffline){
        this.OnlineOrOffline = OnlineOrOffline;
    }

    public String getOnlineOrOffline(){
        return OnlineOrOffline;
    }

    public void setReview(String Reviews){
        this.Reviews = Reviews;
    }

    public String getReviews(){
        return Reviews;
    }

    public void setCost(double Cost){
        this.Cost = Cost;
    }

    public double getCost(){
        return Cost;
    }

    public void setRating(int Rating){
        this.Rating = Rating;
    }

    public int getRating(){
        return Rating;
    }

    public void setDuration(int Duration){
        this.Duration = Duration;
    }

    public int getDuration(){
        return Duration;
    }
}

class Manager{
    String ManagerName;
}

public class Encapsulation{
    public static void main (String[]args){

    }
}
package Encapsulation;


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
        if(Cost > 0.0){
            this.Cost = Cost;
        }else{
            this.Cost = 0;
        }
    }

    public double getCost(){
        return Cost;
    }

    public void setRating(int Rating){
        if(Rating > 0){
            this.Rating = Rating;
        }else{
            this.Rating = 1;
        }
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
    Manager(String ManagerName){
        this.ManagerName = ManagerName;
        System.out.println(" Manager: " + ManagerName);
    }

    public void ManagerReviews(Game game, String Name, String Developer, String Owner, String Company,
                        String Genre, String OnlineOrOffline,  double Cost, int Duration){

            game.setName(Name);
            game.setDeveloper(Developer);
            game.setOwner(Owner);
            game.setCompany(Company);
            game.setGenre(Genre);
            game.setOnlineOrOffline(OnlineOrOffline);
            game.setCost(Cost);
            game.setDuration(Duration);

            System.out.println(" Game Name: " + game.getName());
            System.out.println(" Game Developer: " + game.getDeveloper());
            System.out.println(" Game Owner: " + game.getOwner());
            System.out.println(" Game Company: " + game.getCompany());
            System.out.println(" Game Genre: " + game.getGenre());
            System.out.println(" Game mode: " + game.getOnlineOrOffline());
            System.out.println(" Game Total Cost: $" +game.getCost() +"USD");
            System.out.println(" Game Duration: " + game.getDuration() +"Days");
    }
}

class Player{
    String name;
    String favoriteGame;

    Player(String name, String favoriteGame){
        this.name = name;
        this.favoriteGame = favoriteGame;

        System.out.println(" Player name: " + name);
        System.out.println(" Pro Player at: " + favoriteGame);
    }

    public void PlayerReviews(Game myGame, String Reviews, int Rating){
        myGame.setReview(Reviews);
        myGame.setRating(Rating);

        System.out.println(" Player Review: " + myGame.getReviews());
        System.out.println(" Player Rate: " + myGame.getRating());
    }
}

public class Encapsulation{
    public static void main (String[]args){
        Manager manager = new Manager(" John Doe ");
        manager.ManagerReviews(new Game(), " Pokemon ", " Jonel Tapia ", " John Hanke ", " Niantic ",
                " Adventure ", " Online ", 1700.00, 780);

        System.out.println("\n");

        Player player = new Player(" KingNelx ", " Dota2 ");
        player.PlayerReviews(new Game(), "Good Game", -12);

    }
}
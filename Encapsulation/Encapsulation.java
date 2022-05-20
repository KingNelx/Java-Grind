package Encapsulation;

class Game{
    private String Name;
    private String Developer;
    private String ShortDescription;
    private String Genre;
    private String Reviews;
    private int NumberOfCopiesSell;
    private double totalAssets;
    public double bonusAsset = 2.5;

    public void CopiesSell(){
        if(NumberOfCopiesSell > 0){
                totalAssets = totalAssets * bonusAsset;
                System.out.println(" Sold some Games. Total asset is: " + totalAssets + "$");
        }else{
            System.out.println(" No Games has been sold for today. Total asset is: " + totalAssets + "$");
        }
    }

    public void setName(String name){
        this.Name = name;
    }

    public String getName(){
        return Name;
    }

    public void setDeveloper(String developer){
        this.Developer = developer;
    }

    public String getDeveloper(){
        return Developer;
    }


    public void setShortDescription(String description){
        this.ShortDescription = description;
    }

    public String getShortDescription(){
        return ShortDescription;
    }

    public void setGenre(String genre){
        this.Genre = genre;
    }

    public String getGenre(){
        return Genre;
    }

    public void setReviews(String reviews){
        if(reviews.equals("negative")){

        }
    }
    public void setNumberOfCopiesSell(int copies){
        this.NumberOfCopiesSell = copies;
    }

    public int getNumberOfCopiesSell(){
        return NumberOfCopiesSell;
    }

    public void setTotalAssets(){

    }
}

class Manager{
    String ManagerName;
}

class AnotherPerson{
    String PersonName;
}


public class Encapsulation{
    public static void main (String[]args){

    }
}
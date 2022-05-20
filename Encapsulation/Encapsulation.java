package Encapsulation;

class Game{
    private String Name;
    private String Developer;
    private String ShortDescription;
    private String Genre;
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

    public void setName(){

    }

    public void setDeveloper(){

    }

    public void setShortDescription(){

    }

    public void setGenre(){

    }

    public void setNumberOfCopiesSell(){

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
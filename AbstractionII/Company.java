package AbstractionII;

public abstract class Company {

    private String firstName;
    private String lastName;
    private String CompanyName;
    private String location;
    private double totalAssets;
    private double totalLiabilities;
    public double monthlySalary;

    public boolean isBankrupt(double totalAssets, double totalLiabilities){
        return totalAssets > totalLiabilities;
    }

    public abstract void printData();
    public abstract boolean s();




}

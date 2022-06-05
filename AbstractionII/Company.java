package AbstractionII;

public abstract class Company {

    private String firstName;
    private String lastName;
    private String CompanyName;
    private String location;
    private double totalAssets;
    private double totalLiabilities;
    public double monthlySalary;

    public abstract boolean isBankrupt(double totalAssets, double totalLiabilities);

    public abstract void printData();





}

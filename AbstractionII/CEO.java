package AbstractionII;

public class CEO extends Company {

    private String empName;
    private String job;
    private String companyName;

    public void setName(String empName){
        this.empName = empName;
    }

    public String getName(){
        return empName;
    }

    public void setJob(String job){
        this.job = job;
    }

    public String getJob(){
        return job;
    }

    public void setCompanyName(String companyName){
        this.companyName = companyName;
    }

    public String getCompanyName(){
        return companyName;
    }

    @Override
    public boolean isBankrupt(double Assets, double Liabilities){
        return Assets > Liabilities;
    }

    @Override
    public void gatherData(Company coy, String firstName, String lastName, String companyName, String location,
                           double totalAssets, double totalLiabilities, double monthlySalary){
        coy.setFirstName(firstName);
        coy.setLastName(lastName);
        coy.setCompanyName(companyName);
        coy.setLocation(location);
        coy.setTotalAssets(totalAssets);
        coy.setTotalLiabilities(totalLiabilities);
        coy.setMonthlySalary(monthlySalary);

        System.out.println(" Firstname: " + coy.getFirstName());
        System.out.println(" Lastname: " + coy.getLastName());
        System.out.println(" Company name: " + coy.getCompanyName());
        System.out.println(" Location: " + coy.getLocation());
        System.out.println(" Total assets: " + coy.getTotalAssets());
        System.out.println(" Total liabilities: " + coy.getTotalLiabilities());
        System.out.println(" Total salary: " + coy.getMonthlySalary());

        if(isBankrupt(coy.getTotalAssets(), coy.getTotalLiabilities())){
            System.out.println(" Asset is Greater than Liabilities ");
        }else{
            System.out.println(" Liabilities is Greater than Asset ");
        }
    }
    @Override
    public void printData(){
        gatherData(new CEO(), "Jonel", "Tapia", "Google", "USA",
                700.70, 2256.45, 1400);
    }



}

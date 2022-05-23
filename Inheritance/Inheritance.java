package Inheritance;

public class Inheritance {

    public static void main (String[]args){
        GoogleDeveloper g1 = new GoogleDeveloper();
        GatherInfo s2 = new GatherInfo();
        RustGoogleDeveloper s3 = new RustGoogleDeveloper();

        g1.setName(s2.Name);
        g1.setAge(s2.Age);
        g1.setCompany(s2.Company);
        g1.setPosition(s2.Position);
        g1.setSalary(s2.Salary);

        g1.printData();
        g1.Bonus();


    }
}
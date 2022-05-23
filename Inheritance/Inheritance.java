package Inheritance;

public class Inheritance {

    public static void main (String[]args){
        GoogleDeveloper g1 = new GoogleDeveloper();
        GatherInfo s2 = new GatherInfo();
        RustGoogleDeveloper s3 = new RustGoogleDeveloper();

        s3.setName(s2.Name);
        s3.setAge(s2.Age);
        s3.setCompany(s2.Company);
        s3.setPosition(s2.Position);
        s3.setSalary(s2.Salary);

        s3.printData();
        s3.Bonus();


    }
}
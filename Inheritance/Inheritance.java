package Inheritance;

public class Inheritance {

    public static void main (String[]args){
        GoogleDeveloper s1 = new GoogleDeveloper();
        GatherInfo s2 = new GatherInfo();

        s1.setName(s2.Name);
        s1.setAge(s2.Age);
        s1.setCompany(s2.Company);
        s1.setPosition(s2.Position);
        s1.setSalary(s2.Salary);

        s1.printData();
        s1.Bonus();
    }
}
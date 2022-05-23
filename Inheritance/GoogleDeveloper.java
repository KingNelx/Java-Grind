package Inheritance;

public class GoogleDeveloper {
    private String Name;
    private int Age;
    private String Company;
    private String Position;
    private double Salary;

    public void setName(String Name){
        if(Name.equals("") || Name.equals(" ")){
            this.Name = "Undefined";
        }else{
            this.Name = Name;
        }
    }

    public String getName(){
        return Name;
    }

    public void setAge(int Age){
        this.Age = Age;
    }

    public int getAge(){
        return Age;
    }

    public void setCompany(String Company){
        this.Company = Company;
    }
    public String getCompany(){
        return Company;
    }

    public void setPosition(String Position){
        this.Position = Position.toLowerCase();
    }
    public String getPosition(){
        return  Position;
    }

    public void setSalary(double Salary){
        this.Salary = Salary;
    }
    public double getSalary(){
        return Salary;
    }

    public void printData(){
        System.out.println();
        System.out.println(" Developer Info. ");
        System.out.println(" Name: " + getName());
        System.out.println(" Age: " + getAge());
        System.out.println(" Company: " + getCompany());
        System.out.println(" Position: " + getPosition());
        System.out.println(" Salary: $" + getSalary());
        System.out.println(" Additional Bonus [Depends on the Position] . ");
    }

    public void Bonus(){
        switch (Position) {
            case "senior", "senior level" -> {
                System.out.println(" Current Salary is: $" + getSalary());
                Salary = Salary + 900;
                System.out.println(" " + Name + " salary is: $" + getSalary());
            }
            case "mid", "mid level" -> {
                System.out.println(" Current Salary is: $" + getSalary());
                Salary = Salary + 700;
                System.out.println(" " + Name + " salary is: $" + getSalary());
            }
            case "junior", "junior level" -> {
                System.out.println(" Current Salary is: $" + getSalary());
                Salary = Salary + 500;
                System.out.println(" " + Name + " salary is: $" + getSalary());
            }
            default -> System.out.println(" " + Name + " salary is: $" + getSalary());
        }
    }
}
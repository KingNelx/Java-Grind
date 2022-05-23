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
        this.Position = Position.toLowerCase() + " developer";
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
        if(Position.equals("senior level") || Position.equals("senior level developer")){
            System.out.println(" Current Salary is: $" + getSalary());
            Salary = Salary + 900;
            System.out.println(" " + Name + " salary is: $" + getSalary());
        }else if (Position.equals("mid level") || Position.equals("Mid Level Developer")){
            System.out.println(" Current Salary is: $" + getSalary());
            Salary = Salary + 700;
            System.out.println(" " +  Name + " salary is: $" + getSalary());
        }else if (Position.equals("junior level") || Position.equals("Junior level Developer")){
            System.out.println(" Current Salary is: $" + getSalary());
            Salary = Salary + 500;
            System.out.println(" " +  Name + " salary is: $" + getSalary());
        }else
            System.out.println(" " + Name + " salary is: $" + getSalary());
    }
}
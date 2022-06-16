package InheritanceII;

class Class{
    public String name;
    public String course;
    public int age;

    public void printInfo(){
        System.out.println(" Name: " + name);
        System.out.println(" Course: " + course);
        System.out.println(" Age: " + age);
    }

    public void totalGrades(double average){
        if(average <= 79){
            System.out.println(" Average: " + average);
            System.out.println(" Average is too low ");
        }else{
            System.out.println(" Average: " + average);
            System.out.println(" Average is good ");
        }
    }
}
package InheritanceII;

public class Kevin extends Class{

    private String name = "Kevin";
    private int age = 21;
    private String course = "Computer Engineering";

    @Override
    public void printInfo(){
        System.out.println(name);
        System.out.println(age);
        System.out.println(course);
    }

    @Override
    public void totalGrades(double average) {
        super.totalGrades(average);
    }
}

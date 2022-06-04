package Abstraction;

public class Test1 extends Test{
    @Override
    public void setTitle(String title) {
        super.setTitle(title);
    }

    @Override
    public void setPassingScore(int passingScore){
        super.setPassingScore(passingScore);
    }

    @Override

    public void printData() {
        System.out.println(" Title is: " + getTitle());
        System.out.println(" Passing score is: " + getPassingScore());

    }

    @Override
    public void checkScore(int myScore) {
        if(myScore >= 85){
            System.out.println(" Pass ");
        }else{
            System.out.println(" Fail ");
        }
    }
}

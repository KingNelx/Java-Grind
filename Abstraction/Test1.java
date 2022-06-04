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
        System.out.println(getTitle());
        System.out.println(getPassingScore());

    }

    @Override
    public void checkScore(int myScore) {
        if(myScore >= 85){
            System.out.println(" Passing Score");
        }else{
            System.out.println(" Fail Score ");
        }
    }
}

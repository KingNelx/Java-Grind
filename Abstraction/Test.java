package Abstraction;

public abstract class Test {
    private String title;
    private int passingScore;
    public String teacher;
    public String school;
    public int score;


    public void setTitle(String title){
        this.title = title;
    }
    public String getTitle(){
        return title;
    }

    public void setPassingScore(int passingScore){
        this.passingScore = passingScore;
    }
    public int getPassingScore(){
        return passingScore;
    }

    public abstract void printData();
    public abstract void checkScore(int myScore);
}

package Abstraction;

public class Test2 extends Test{

    private static int PythonGrade = 89;
    private static int JavaGrade = 96;
    private static int SqlGrade = 99;
    private static int WebDesignGrade = 91;

    @Override
    public void printData(){
        teacher = " John Doe ";
        school = " Canada ";
        score = 90;
        printInfo(teacher, school, score);
        checkScore(score);
    }
    public void printInfo(String s1, String s2, int s3){
        System.out.println(s1 + " " + s2 + " " + s3);
    }

    @Override
    public void checkScore(int Score){
        int finalScore = (int) ((PythonGrade + JavaGrade + SqlGrade + WebDesignGrade) * 0.5 / 2);
        if(finalScore >= 96){
            System.out.println(" Final Score is: " + finalScore);
            System.out.println(" Very Good");
        }else if (finalScore >= 90 && finalScore <= 95){
            System.out.println(" Final Score is: " + finalScore);
            System.out.println(" Good");
        }else{
            System.out.println(" Final Score is: " + finalScore);
            System.out.println(" Ok Yes");
        }
    }
}

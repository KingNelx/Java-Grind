package OOPExercise;

class Student{
    private String StudentName;
    private boolean isStudentRegister;
    private String BatchName;

   public String getStudentName(){
       return StudentName;
   }

   public void setStudentName(String StudentName){
       this.StudentName = StudentName;
   }

   public boolean isStudentRegister() {
        return isStudentRegister;
   }

   public void isStudentRegister(boolean isStudentRegister){
       this.isStudentRegister = isStudentRegister;
   }

   public String getBatchName(){
       return BatchName;
   }

   public void setBatchName(String BatchName){
       this.BatchName = BatchName;
   }

}


public class Lab3 {
    public static void main (String[]args){
        Student s1 = new Student();
        s1.setStudentName(" Jonel Tapia ");
        s1.isStudentRegister(true);
        s1.setBatchName(" CICT ");
        System.out.println(s1.getStudentName());
        System.out.println(s1.isStudentRegister());
        System.out.println(s1.getBatchName());
    }
}

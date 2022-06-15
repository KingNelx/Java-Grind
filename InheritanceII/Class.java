package InheritanceII;

public class Class {
    private String className;
    private int rate;

    public void setName(String className){
        this.className = className;
    }

    public String getName(){
        return className;
    }

    public void setRate(int rate){
       if(rate < 0){
           this.rate = 1;
       }else{
           this.rate = rate;
       }
    }

    public int getRate(){
        return rate;
    }
}

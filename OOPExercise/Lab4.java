package OOPExercise;

class SuperClass{

    private int data2;

    public void checkCondition(int myData){
    }

    public void setData2(int data2){
        this.data2 = data2;
    }

    public int getData2(){
        return data2;
    }

    public SuperClass(int data1, int data2){

    }
}

class SubClass extends  SuperClass{

    public SubClass(int data1, int data2) {
        super(data1, data2);
    }
}

public class Lab4 {
    public static void main (String[]args){

    }
}

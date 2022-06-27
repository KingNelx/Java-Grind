package OOPExercise;

class Shape{
    public void show(){
        System.out.println(" Test ");
    }

    public void getInfo(){
        System.out.println(" This method is not override ");
    }
}

class Circle extends Shape{
    @Override
    public void show(){
        System.out.println(" Test Circle ");
    }
}

class Rectangle extends  Shape{
    @Override
    public void show(){
        System.out.println(" Test Rectangle ");
    }


}

public class Lab1 {
    public static void main (String[]args){
        Shape s1 = new Shape();
        Circle s2 = new Circle();
        Rectangle s3 = new Rectangle();

        s1.getInfo();
        s1.show();
        s2.getInfo();
        s2.show();
        s3.getInfo();
        s3.show();

    }
}

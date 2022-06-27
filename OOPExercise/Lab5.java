package OOPExercise;

class MyMath{
    public int  add(int n1, int n2){
        int result = n1 + n2;
        return result;
    }

    public int add(int a1, int a2, int a3){
        int result = a1 + a2 + a3;
        return result;
    }

    public int add(int z1, int z2, int z3, int z4){
        int result = z1 + z2 + z3 + z4;
        return result;
    }
}

public class Lab5 {
    public static void main (String[]args){
        MyMath s1 = new MyMath();

        int res1 = s1.add(10, 15);
        int res2 = s1.add(2, 4, 6);
        int res3 = s1.add(5, 5, 5, 5);
        System.out.println(res1);
        System.out.println(res2);
        System.out.println(res3);
    }
}

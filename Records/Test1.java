package Records;

public class Test1 {
    private static String name;
    private static int age;

    public Test1(String name, int age){
        this.name = name;
        this.age = age;
    }

    public static String getName() {
        return name;
    }

    public static void setName(String name) {
        Test1.name = name;
    }

    public static int getAge() {
        return age;
    }

    public static void setAge(int age) {
        Test1.age = age;
    }
}

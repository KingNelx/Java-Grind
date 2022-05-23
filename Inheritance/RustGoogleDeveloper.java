package Inheritance;

public class RustGoogleDeveloper extends GoogleDeveloper {

    @Override

    public void printData(){
        super.printData();
    }

    @Override
    public void Bonus(){
        System.out.println(" Rust Developer ");
        super.Bonus();
    }



}

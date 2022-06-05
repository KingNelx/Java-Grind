package AbstractionII;

public class CEO extends Company {

    @Override
    public boolean isBankrupt(double Assets, double Liabilities){
        return Assets > Liabilities;
    }

    @Override
    public void printData(Company coy){

    }
}

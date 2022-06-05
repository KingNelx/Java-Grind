package AbstractionII;

public class Employee {

    public void empInfo(CEO c1, String name, String job, String company){
        c1.setName(name);
        c1.setJob(job);
        c1.setCompanyName(company);

        System.out.println(c1.getName());
        System.out.println(c1.getJob());
        System.out.println(c1.getCompanyName());
    }
}

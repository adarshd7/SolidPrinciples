package solidprinciples_resolve;

public class PayCheckBonus implements Salary{
    public void issuePayCheck(){
        double bonus =10000;
        double salary =100000;
        salary = salary + bonus;
        System.out.println(salary);
    }
}

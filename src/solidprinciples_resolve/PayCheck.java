package solidprinciples_resolve;

public class PayCheck implements Salary {
    @Override
    public void issuePayCheck(){
        double salary=100000;
        System.out.println(salary);
    }
}

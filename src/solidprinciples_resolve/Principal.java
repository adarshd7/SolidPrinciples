package solidprinciples_resolve;
                                                //resolving liskov substituition priciple by
public class Principal extends Professor {
    public void issueSalary(){
        double Salary=300000;
        System.out.println(Salary);
    }
    public void printDetails()
    {
        String name="Tony";
        String collegename="MVSR";
        System.out.println(name+ " " +collegename);
    }
}
class Principalmain{
    public static void main(String[] args){

        Principal principal1=new Principal();
        principal1.issueSalary();
        principal1.printDetails();
    }
}

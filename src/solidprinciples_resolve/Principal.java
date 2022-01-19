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
        String Collegename="MVSR";
        System.out.println(name+ " " +Collegename);
    }
}
class Principalmain{
    public static void main(String[] args){

        Principal p1=new Principal();
        p1.issueSalary();
        p1.printDetails();
    }
}

package solidprinciple_violations;

public class Principal extends Professor{
    public void Worksindepartment(){
      //   String Deptname="Cse"
        //System.out.println(Deptname);
        //Since principal violates liskov substitution principle
    }
    public void issueSalary(){
        double Salary=200000;
        System.out.println(Salary);
    }
    public void printDetails()
    {

    }
}

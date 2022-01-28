package solidprinciples_resolve;

public class Professor implements Employee{
    public int id;
    public String name;
    public double salary=100000.0;

    Professor(){}
    Professor(int id,String name) {

        this.id=id;
        this.name=name;

    }
    public void printDetails()
    {
        System.out.println( id + " "+name);
    }

    public void issuePayCheck(){   // resolving both open closed principle and dependency inversion principle
                                        //by allowing issuePayCheck can be extended without modifying the exting method
        Salary salary=new PayCheck();
        salary.issuePayCheck();


    }


    public static void main(String[] args){

        Professor professor = new Professor(100,"lavya");
        professor.printDetails();
        professor.issuePayCheck();
        ProfessorDepartment professor1 = new ProfessorDepartment();
        professor1.worksInDepartment();


    }
}

package solidprinciple_violations;

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

    public void issueSalary(){               //  we need to modify it as salary may increment and may get bonus
                                                //it violates open closed principle.
                                                    //Dependency inversion principle also violates if we modify it
            System.out.println(salary);
    }
    public void worksAtDepartment(){
            System.out.println("CSE");
    }
    public static void main(String[] args){

        Professor p=new Professor(100,"lavya");
        p.printDetails();
        p.issueSalary();

    }
}

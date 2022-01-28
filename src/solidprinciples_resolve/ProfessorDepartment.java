package solidprinciples_resolve;
                                            //resolving liskov substitution principle
public class ProfessorDepartment extends Professor implements TeachatDepartment {


    public void worksInDepartment() {
        String dept = "Cse";
        System.out.println(dept);
    }


}

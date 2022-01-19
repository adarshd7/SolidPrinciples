package solidprinciples_resolve;
                                            //resolving liskov substitution principle
public class ProfessorDepartment extends Professor implements TeachatDepartment {


    public void worksInDepartment() {
        String dept = "CSE";
        System.out.println(dept);
    }


}

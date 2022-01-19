package solidprinciples_resolve;
                                        //resolving both single responsibility and Interface Segregation Principkeimport mypackage.Student;

import java.util.Scanner;

public class ExistingStudent implements StudentInfo,StudentGrade {
    private String name;
    private int id;
    private String course;
    static int age=21;
    Scanner sc = new Scanner(System.in);
    ExistingStudent(String name,int id,String course){
        this.name=name;
        this.id=id;
        this.course=course;
    }


    public void courseDetails(){
        System.out.println("course datails are");
        System.out.println(id +" "+course);
    }
    public void studentDetails(){
        System.out.println(name);
        System.out.println(age);
    }
    public void studentPercentage(){
        // violating Interface Segregation
        System.out.println("Enter number of subjects");
        int n=sc.nextInt();
        int marks[] = new int[n];
        int total=0;
        float per;
        System.out.println("Enter marks out of 100 for "+ n +"Subjects");
        for(int i=0;i<n;i++){
            marks[i]=sc.nextInt();
            total =total+marks[i];
        }
        per=(float)(total)/n;
        System.out.println("Total marks" +" "+total);
        System.out.println("percentage"+" "+per);
    }

}
class ExistingStudentMain{
    public static void main(String [] args){

        ExistingStudent s1 = new ExistingStudent("adarsh",101,"CSE");
        s1.courseDetails();
        s1.studentDetails();
        s1.studentPercentage();
        NewStudent s2 = new NewStudent("adi",102,"IT");
        s2.courseDetails();
        s2.studentDetails();
    }
}

package solidprinciple_violations;

import java.util.*;

public class Student implements StudentInfo {
    private String name;
    private int id;
    private String course;
    static int age=21;
    Scanner sc = new Scanner(System.in);
    Student(String name,int id,String course){
        this.name=name;
        this.id=id;
        this.course=course;
    }


    public void courseDetails(){
        System.out.println("course datails are");
        System.out.println(id +" "+course);
    }
    public void printStudentDetails(){
        System.out.println(name);
        System.out.println(age);
    }
    public void studentPercentage(){                  //for new student their will be no percentage
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

    public static void main(String[] args) {
	    Student s1 = new Student("adarsh",101,"CSE");
        s1.courseDetails();
        s1.studentPercentage();
        s1.printStudentDetails();
    }
}

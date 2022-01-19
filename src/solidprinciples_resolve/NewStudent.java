package solidprinciples_resolve;

import java.util.Scanner;
                                                //resolving both single responsibility and Interface Segregation Principke
public class NewStudent implements StudentInfo {

    private String name;
    private int id;
    private String course;
    static int age=21;
    Scanner sc = new Scanner(System.in);
    NewStudent(String name,int id,String course){
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

}
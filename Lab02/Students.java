import java.util.*;

public class Students{
    public int rollNo,age;
    public String name, gender;
    public double cgpa;
    //default constructor
    public void Students(){
        rollNo=0;
        age=0;
        name=" ";
        gender=" ";
        cgpa=0.00;
    }
    //parameterized constructor
    public void Students(int id,int a,String n,String g,double gpa){
        rollNo=id;
        age=a;
        name=n;
        gender=g;
        cgpa=gpa;
    }
    //main
    public static void main(String[] args){
        ArrayList<Students> students=new ArrayList<>();
        Students Waliya=new Students();
        Waliya.gender="F";
        students.add(Waliya);
        int i=0;
        int size=students.size();
        while(i<size){
            Students obj=(Students) students.get(i);
            System.out.println(obj.gender);
            i++;
        }
    }
}
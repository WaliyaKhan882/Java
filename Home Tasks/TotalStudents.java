//write a program to count and display total no of students in memory of class students

public class TotalStudents{

    public static int counter=0;
    public String name,gender;
    public int roll;
    public double cgpa;

    public TotalStudents(){
        this.gender=" ";
        this.cgpa=0;
        this.name=" ";
        this.roll=0;
        counter=getCounter()+1;
        setCounter(counter);
    }

    public TotalStudents(String n,String g,int r,double c){
        gender=g;
        cgpa=c;
        name=n;
        roll=r;
        counter=getCounter()+1;
        setCounter(counter);
    }

    public static void setCounter(int count) {
        counter = count;
    }

    public static int getCounter() {
        return counter;
    }

    public static void main(String[] args){
        TotalStudents s1=new TotalStudents();
        TotalStudents s2=new TotalStudents("waliya","F",1,3.98);
        System.out.println("Counter: " + getCounter());
    }
}
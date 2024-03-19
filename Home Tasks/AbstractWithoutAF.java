abstract class Car{

    public void show(){
        System.out.println("this is declared in abstract class");
    }

}

public class AbstractWithoutAF extends Car{
    public void show(){
        System.out.println("this is declared in non-abstract class");
    }
    public static void main(String[] args){
        Car c=new AbstractWithoutAF();
        c.show();
    }
}
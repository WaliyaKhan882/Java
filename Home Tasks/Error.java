/*
if ref var of parent contain obj of child class then only those functions can be called through this
ref variable which are also available in parent class.
 */

class Shape{
    public int radius=5;
//    void show(){
//        System.out.println("Radius: "+radius);
//    }
}

class Circle extends Shape{
    void show(){
//        super.show();
        System.out.println(radius);
    }
}

public class Error{
    public static void main(String[] args){
        Shape S=new Circle();
        S.show();
    }

}
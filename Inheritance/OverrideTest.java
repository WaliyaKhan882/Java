import java.util.*;

class Circle {
    public double radius;

    public Circle(double radius){
        this.radius = radius;
    }

    public double getArea(){
        return Math.PI * radius * radius;
    }
}

class Cylinder extends Circle {
   public double length;

    // Constructor should have the same name as the class
    public Cylinder(double radius, double length) {
        super(radius); // Call superclass constructor to set the radius
        this.length = length;
    }

    public double getArea() {
        return 2 * super.getArea() + 2 * Math.PI * radius * length;
    }
}

public class OverrideTest{
//    public static void main(String[] args){
//        //Circle Class
//        Circle myCircle=new Circle(1.20);
//        System.out.println("Area of Circle: "+myCircle.getArea());
//
//        //Cylinder class
//        Cylinder myCylinder=new Cylinder(2,3);
//        String value=String.format("%.2f",myCylinder.getArea());
//        System.out.println("Area of Cylinder: "+value);
//
//        //upcasting
//        Circle myCircle1=new Cylinder(1,6);
//        System.out.println("Upcasting.....");
//        System.out.println("Area of Cylinder is "+ myCircle1.getArea());
//
//        //downcasting
//        Circle myCircle2=new Cylinder(2,4);
//        Cylinder myCylinder2=(Cylinder) myCircle2;
//        System.out.println("Area of Cylinder is "+ myCircle2.getArea());//both will give same answer
//        System.out.println("Area of Cylinder is "+ myCylinder2.getArea());
//
//        //wrong case child variable can't contain parent object
//        Cylinder myCylinder3=new Circle(2);
//        System.out.println("Area of Circle: "+myCylinder3.getArea());
//    }
    public static void main(String[] args){
        ArrayList<Circle> shapes=new ArrayList<>();
        Circle myCircle1=new Cylinder(1,6);
        Circle myCircle=new Circle(3.5);
        Circle myCircle2=new Cylinder(2,4);
        Circle myCircle3=new Circle(1.20);
        Cylinder myCylinder=new Cylinder(2,3);

        shapes.add(myCircle);
        shapes.add(myCylinder);
        shapes.add(myCircle1);
        shapes.add(myCircle2);
        shapes.add(myCircle3);

        int i=0;
        int size=shapes.size();
        while(i<size){
            Circle obj=(Circle) shapes.get(i);
            if (obj instanceof Cylinder) {
                Cylinder cylinder = (Cylinder) obj;
                System.out.println("Type: Cylinder, Area: " + cylinder.getArea());
            } else if (obj instanceof Circle) {
                System.out.println("Type: Circle, Area: " + obj.getArea());
            }
            i++;
        }
    }
}
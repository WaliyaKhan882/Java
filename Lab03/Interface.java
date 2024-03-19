/*
Each ThreeDimensionalShape should have methods getArea and getVolume to calculate the surface area and volume,
respectively, of the three-dimensional shape.
Write a Driver class that uses an array of ThreeDimensionalShape references to objects of each concrete class in the
hierarchy. The program should print a text description of the object to which each array element refers. Also, in the loop that
processes all the shapes in the array, determine whether each shape is a Sphere, Cube or Tetrahedron. Make a call to area
and volume, polymaprphically.
`
Instruction:
 Area of a Sphere: 4πr2
 Area of a Cube: 6a

2 (a is the side length of a cube)

 Area of a Tetrahedron: √3 a
2
 Volume of a Sphere: 4/3 πr3
 Volume of a Cube: a

3 (a is the side length of a cube)

 Volume of a Tetrahedron: a
3/(6√2)

 You can use instanceof operator to determine the type of object e.g., if(obj instanceof -----------){}
 You can override String toString()method in your respective class to print the text description of the object. This
method will be invoked whenever you will print the object of that class. e.g., System.out.println(obj);
 Take input for all the required parameters (i.e., radius, side-length, etc.).
 */

import java.util.*;

interface ThreeDimensionalShape{

    abstract double getArea();
    abstract double getVolume();

}

class Sphere implements ThreeDimensionalShape{
    double radius;

    public Sphere(double r){
        radius=r;
    }

    @java.lang.Override
    public double getVolume() {
        return ((4/3) * Math.PI * Math.pow(radius,3));
    }

    @java.lang.Override
    public double getArea() {
        return (4 * Math.PI * Math.pow(radius,2));
    }

    public String toString(){
        return "radius: "+radius+" area: "+getArea()+" volume: "+getVolume();
    }
}

class Cube implements ThreeDimensionalShape{

    double sideLength;

    public Cube(double sl){
        sideLength=sl;
    }

    @java.lang.Override
    public double getVolume() {
        return (Math.pow(sideLength,3));
    }

    @java.lang.Override
    public double getArea() {
        return (6 * Math.pow(sideLength,2));
    }

    public String toString(){
        return "sidelength: "+sideLength+" area: "+getArea()+" volume: "+getVolume();
    }
}

class Tetrahedron implements ThreeDimensionalShape{

    double sideLength;

    public Tetrahedron(double sl){
        sideLength=sl;
    }

    @java.lang.Override
    public double getVolume() {
        return ((Math.pow(sideLength,3))/(6*Math.sqrt(2)));
    }

    @java.lang.Override
    public double getArea() {
        return ((Math.sqrt(3))*Math.pow(sideLength,2));
    }

    public String toString(){
        return "sidelength: "+sideLength+" area: "+getArea()+" volume: "+getVolume();
    }
}

public class Interface {
    public static void main(String[] args){
        int size=3;
        ThreeDimensionalShape[] shapes=new ThreeDimensionalShape[size];
        shapes[0]=new Sphere(5);
        shapes[1]=new Cube(8);
        shapes[2]=new Tetrahedron(4);

        for(int i=0;i<size;i++){
            if(shapes[i] instanceof Sphere){
                System.out.println("At index[" + i + "], Object is Sphere");
            }
            else if(shapes[i] instanceof Cube){
                System.out.println("At index[" + i + "], Object is Cube");
            }
            else if(shapes[i] instanceof Tetrahedron){
                System.out.println("At index[" + i + "], Object is Tetrahedron");
            }
            System.out.println(shapes[i]);
        }
    }

}

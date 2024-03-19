// Each ThreeDimensionalShape should have methods getArea and getVolume to calculate
// the surface area and volume, respectively, of the three-dimensional shape.
// Write a Driver class that uses an array of ThreeDimensionalShape references to
// objects of each concrete class in the hierarchy. The program should print a text
// description of the object to which each array element refers. Also, in the loop that
// processes all the shapes in the array, determine whether each shape is a Sphere,
// Cube or Tetrahedron. Make a call to area and volume, polymaprphically.


// Instruction:

// You can use instanceof operator to determine the type of object e.g.,
// if(obj instanceof -----------){}
// You can override String toString()method in your respective class to print the text
// description of the object. This method will be invoked whenever you will print the
// object of that class. e.g., System.out.println(obj);
// Take input for all the required parameters (i.e., radius, side-length, etc.).

import java.lang.Math;

abstract class ThreeDimensionalShape
{
    double radius;
    double sidelength;
    ThreeDimensionalShape()
    {
        radius = 0.0;
        sidelength = 0.0;
    }
    abstract double getArea();
    abstract double getVolume();
}

class Sphere extends ThreeDimensionalShape
{
    double area;
    double volume;
    Sphere()
    {
        super.radius = 0.0;
    }
    Sphere(double r)
    {
        super.radius = r;
    }
    double getArea()
    {
        area = 4 * Math.PI * Math.pow(radius, 2);
        return area;
    }
    double getVolume()
    {
        volume = (4/3) * (Math.PI * Math.pow(radius, 3));
        return volume;
    }
    public String toString()
    {
        return "Sphere\n" + "Area:" + getArea() + "\nVolume:" + getVolume();
    }
}

class Cube extends ThreeDimensionalShape
{
    double area;
    double volume;
    public Cube()
    {
        super.sidelength = 0.0;
    }
    Cube(double sl)
    {
        super.sidelength = sl;
    }
    void setSideLength(double sl)
    {
        super.sidelength = sl;
    }
    double getArea()
    {
        area = 6 * Math.pow(sidelength, 2);
        return area;
    }
    double getVolume()
    {
        volume = Math.pow(sidelength, 3);
        return volume;
    }
    public String toString()
    {
        return "Cube\n" + "Area:" + getArea() + "\nVolume:" + getVolume();
    }
}

class Tetrahedron extends ThreeDimensionalShape
{
    double area;
    double volume;
    Tetrahedron()
    {
        super.sidelength = 0.0;
    }
    Tetrahedron(double sl)
    {
        super.sidelength = sl;
    }
    void setSideLength(double sl)
    {
        super.sidelength = sl;
    }
    double getArea()
    {
        double a = 3 * Math.pow(sidelength, 2);
        area = Math.sqrt(a);
        return area;
    }
    double getVolume()
    {
        volume = Math.pow(sidelength, 3) / (6 * Math.sqrt(2));
        return volume;
    }
    public String toString() //public otherwise error
    {
        return "Tetrahedron\n" + "Area:" + getArea() + "\nVolume:" + getVolume();
    }
}

public class Driver
{
    public static void main(String[] args)
    {
        int SIZE = 10;
        ThreeDimensionalShape[] tds = new ThreeDimensionalShape[SIZE];

        tds[0] = new Sphere(2);
        tds[1] = new Cube(5);
        tds[2] = new Sphere(2);
        tds[3] = new Tetrahedron(8);
        tds[4] = new Cube(5);
        tds[5] = new Cube(5);
        tds[6] = new Sphere(2);
        tds[7] = new Tetrahedron(8);
        tds[8] = new Sphere(2);
        tds[9] = new Tetrahedron(8);

        for(int i=0; i<SIZE; i++)
        {
            if(tds[i] instanceof Sphere)
            {
                System.out.println("At index[" + i + "], Object is Sphere");
            }
            else if(tds[i] instanceof Cube)
            {
                System.out.println("At index[" + i + "], Object is Cube");
            }
            else if(tds[i] instanceof Tetrahedron)
            {
                System.out.println("At index[" + i + "], Object is Tetrahedron");
            }
            System.out.println(tds[i]);
        }
    }
}
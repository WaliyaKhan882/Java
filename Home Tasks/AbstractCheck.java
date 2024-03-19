abstract class Myclass{

    public abstract void display();

    public abstract void displaySomething();

    public void show()
    {System.out.println("This method is declared in Abstract class");}

}

public class AbstractCheck extends Myclass{

    public void displaySomething()
    { System.out.println("This method is 'displaySomething' and declared in abstract class");}

    public void display()
    { System.out.println("This method is 'display' and declared in abstract class");}


    public static void main(String args[]){
        Myclass b = new AbstractCheck();
        b.display();
        b.show();

    }

}
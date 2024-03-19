import java.util.Scanner;

class Intgr {
    public int val1;
    public int val2;

    public Intgr() {
        val1 = 0;
        val2 = 0;
    }

    public Intgr(int d1, int d2) {
        val1 = d1;
        val2 = d2;
    }

    public void setVal1(int val1) {
        this.val1 = val1;
    }

    public int getVal1() {
        return val1;
    }

    public void setVal2(int val2) {
        this.val2 = val2;
    }

    public int getVal2() {
        return val2;
    }
}

public class Driver {

    public static int add(int d1, int d2) {
        return d1 + d2;
    }

    public static void displaySum(int sum) {
        System.out.println("Sum of 2 integers is: " + sum);
    }

    public static void main(String[] args) {
        Scanner inp = new Scanner(System.in);
        System.out.println("Enter Num1");
        int d1 = inp.nextInt();

        System.out.println("Enter Num2");
        int d2 = inp.nextInt();

        Intgr obj=new Intgr();
        obj.setVal1(d1);
        obj.setVal2(d2);

        int sum = add(obj.getVal1(), obj.getVal2());
        displaySum(sum);

    }
}

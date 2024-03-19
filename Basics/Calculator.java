import java.util.*;
import javax.swing.*;

public class Calculator {
    public static void main(String[] args){
        int option = Integer.parseInt(JOptionPane.showInputDialog("Enter 1 For Addition\nEnter 2 For Subtraction\nEnter 3 For Multiplication\nEnter 4 For Division\nEnter 5 For Modulus\nEnter 6 For Power\n"));
        int num1 = Integer.parseInt(JOptionPane.showInputDialog("Enter First Number"));
        int num2 = Integer.parseInt(JOptionPane.showInputDialog("Enter Second Number"));
        Calculator myCalculator=new Calculator();
        int result = myCalculator.Calculate(option, num1, num2);
        JOptionPane.showMessageDialog(null, "Result: " + result);
    }

    public int Calculate(int option,int n1,int n2){
        int result=0;
        switch(option){
            case 1:
                result=n1+n2;
                break;
            case 2:
                result=n1-n2;
                break;
            case 3:
                result=n1*n2;
                break;
            case 4:
                result=n1/n2;
                break;
            case 5:
                result=n1%n2;
                break;
            case 6:
                result=(int) Math.pow(n1,n2);
                break;
            default:
                JOptionPane.showMessageDialog(null, "Invalid Option");
                break;
        }
        return result;
    }
}
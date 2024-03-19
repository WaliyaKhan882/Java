import javax.swing.*;

public class Task01{
    public static void main(String[] args){
        int size=Integer.parseInt(JOptionPane.showInputDialog("Enter Size of the shape"));
        Task01 shape=new Task01();
        shape.Rectangle(size);
    }
    public void Rectangle(int size){
        for(int i=0;i<size;i++){
            for(int j=1;j<=i;j++){
                System.out.print("* ");
            }
            for(int k = 14 - (i * 4); k > 0; k--){
                if(i==size-1){
                    System.out.print(" ");
                }
                else {
                    System.out.print("*");
                }
            }
            for(int j=1;j<=i;j++){
                System.out.print(" *");
            }
            System.out.println("\n");
        }
        for(int i=size-2;i>=0;i--){
            for(int j=1;j<=i;j++){
                System.out.print("* ");
            }
            for(int k = 14 - (i * 4); k > 0; k--){
                if(i==size-1){
                    System.out.print(" ");
                }
                else {
                    System.out.print("*");
                }
            }
            for(int j=1;j<=i;j++){
                System.out.print(" *");
            }
            System.out.println("\n");
        }
    }
}
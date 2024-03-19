import java.util.Scanner;

public class Add {
    public Add() {
    }

    public static void main(String[] var0) {
        Scanner var1 = new Scanner(System.in);
        System.out.println("Enter First Number\n");
        int var2 = var1.nextInt();
        System.out.println("Enter Second Number\n");
        int var3 = var1.nextInt();
        add(var2, var3);
    }

    public static void add(int var0, int var1) {
        System.out.println(var0 + var1);
    }
}
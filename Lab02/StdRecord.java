import javax.swing.*;
import java.util.*;

public class StdRecord {

    public int age;
    public static int rollNo = 0;
    public double cgpa;
    public String name, gender;
    public static int strength;
    public static StdRecord[] students;

    public static void main(String[] args) {
        strength = Integer.parseInt(JOptionPane.showInputDialog("What is your Class Strength?"));
        students = new StdRecord[strength];
        int option;
        do {
            option = Integer.parseInt(JOptionPane.showInputDialog("Choose:\n1 for Add\n2 for view\n3 for delete\n4 for update\n0 for Exit"));
            recordManagement(option);
        } while (option != 0);
    }

    public StdRecord() {
        this.name = " ";
        this.cgpa = 0;
        this.gender = " ";
        this.age = 0;
    }

    public StdRecord(String name, String gender, int age, double cgpa) {
        this.age = age;
        this.cgpa = cgpa;
        this.gender = gender;
        this.name = name;
    }

    public static void recordManagement(int option) {
        switch (option) {
            case 0:
                break;
            case 1:
                if (rollNo < strength) {
                    int roll = addStudent();
                    JOptionPane.showMessageDialog(null, roll);
                    rollNo++;
                } else {
                    JOptionPane.showMessageDialog(null, -1);
                }
                break;
            case 2:
                viewStudent();
                break;
            case 3:
                deleteStudent();
                break;
            case 4:
                updateStudent();
                break;
            default:
                JOptionPane.showMessageDialog(null, "INVALID OPTION!!!");
                break;
        }
    }

    public static int addStudent() {
        String name = JOptionPane.showInputDialog("Enter Your Name");
        int age = Integer.parseInt(JOptionPane.showInputDialog("Enter Your Age"));
        String gender = JOptionPane.showInputDialog("Enter Your Gender");
        double cgpa = Double.parseDouble(JOptionPane.showInputDialog("Enter Your cgpa"));
        students[rollNo] = new StdRecord(name, gender, age, cgpa);
        return rollNo;
    }

    public static void viewStudent() {
        int roll = Integer.parseInt(JOptionPane.showInputDialog("Enter Roll No"));
        if (roll < strength && roll >= 0 && students[roll] != null) {
            JOptionPane.showMessageDialog(null, "Student Name: " + students[roll].name + "\n" + "Gender: " + students[roll].gender + "\n" + "Age: " + students[roll].age + "\n" + "CGPA: " + students[roll].cgpa + "\n");
        } else if (roll > strength || roll < 0) {
            JOptionPane.showMessageDialog(null, "RollNo doesn't exist");
        } else if (students[roll] == null) {
            JOptionPane.showMessageDialog(null, "No Student at this roll no");
        }
    }

    public static void updateStudent() {
        int roll = Integer.parseInt(JOptionPane.showInputDialog("Enter Roll No"));
        if (roll >= 0 && roll < strength && students[roll] != null) {
            String newName = JOptionPane.showInputDialog("Enter new name:");
            String newGender = JOptionPane.showInputDialog("Enter gender:");
            int newAge = Integer.parseInt(JOptionPane.showInputDialog("Enter age:"));
            double newCgpa = Double.parseDouble(JOptionPane.showInputDialog("Enter CGPA:"));
            students[roll].name = newName;
            students[roll].gender = newGender;
            students[roll].age = newAge;
            students[roll].cgpa = newCgpa;
            JOptionPane.showMessageDialog(null, "Student details updated successfully!");
        } else {
            JOptionPane.showMessageDialog(null, "Invalid Roll No or No Student found at this Roll No.");
        }
    }

    public static void deleteStudent() {
        int roll = Integer.parseInt(JOptionPane.showInputDialog("Enter Roll No"));
        if (roll >= 0 && roll < strength && students[roll] != null) {
            students[roll] = null;
            JOptionPane.showMessageDialog(null, "Student deleted successfully!");
        } else {
            JOptionPane.showMessageDialog(null, "Invalid Roll No or No Student found at this Roll No.");
        }
    }

}
import java.util.Scanner;

public class Main {

    public static int id=0;
    public static String[] studentNames = new String[100];
    public static double[] studentMarks = new double[100];
    public static Scanner scn = new Scanner(System.in);
    public static void addStudent(){
        System.out.println("Enter Name of the Student: ");
        studentNames[id] = scn.nextLine();
        System.out.println("Enter Marks of the Student: ");
        studentMarks[id] = scn.nextDouble();
        
        scn.nextLine();
        System.out.println("Student added Successfully !");
        id++;
    }

    public static void displayStudents(){
        System.out.println("Students: ");
        System.out.println("Name\t\tMarks");
        for(int i = 0;i<id;i++){
            System.out.println(studentNames[i] + "\t\t" + studentMarks[i]);
        }
    }

    public static int findIndex(String name){
        if(studentNames == null) return -1;
        for(int i = 0;i<id;i++){
            if(studentNames[i].equalsIgnoreCase(name)){
                return i;
            }
        }
        return -1;
    }
    public static void searchStudent(){
        System.out.println("Enter Student's Name: ");
        int i = findIndex(scn.nextLine());
        if(i != -1){
            System.out.println("Name: "+studentNames[i]);
            System.out.println("Marks: "+studentMarks[i]);
        }
        else{
            System.out.println("Student Not Found !");
        }
    }
    public static void main(String[] args){
        addStudent();
        addStudent();
        addStudent();
        displayStudents();
        searchStudent();
    }
}
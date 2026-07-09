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
    public static void updateMarks(){
        System.out.println("Enter Student's Name: ");
        int i = findIndex(scn.nextLine());
        
        if(i != -1){
            System.out.println("Current Marks: "+studentMarks[i]);
            System.out.println("Enter Updated Marks: ");
            studentMarks[i] = scn.nextDouble();
            scn.nextLine();
            System.out.println("Marks Updated Successfully !");
        }
        else{
            System.out.println("Student Not Found !");
        }
    }
    public static void deleteStudent(){
        System.out.println("Enter Name of the Student: ");
        int i = findIndex(scn.nextLine());

        if(i!=-1){
            while(i<id){
                studentNames[i] = studentNames[i+1];
                studentMarks[i] = studentMarks[i+1];
                i++;
            }
            id--;
            System.out.println("Student Deleted Successfully !");
        }
        else{
            System.out.println("Student Not Found !");
        }
    }
    public static void averageMarks(){
        double sum=0;
        int i=0;
        while(i<id){
            sum+=studentMarks[i];
            i++;
        }
        System.out.println("Average Marks: "+ sum/id);
    }
    public static void highestMarks(){
        double max = studentMarks[0];
        for(int i =1;i<id;i++){
            if(studentMarks[i] > max){
                max = studentMarks[i];
            }
        }
        System.out.println("Highest Marks: "+max);
    }
    public static void lowestMarks(){
        double min = studentMarks[0];
        for(int i =1;i<id;i++){
            if(studentMarks[i] < min){
                min = studentMarks[i];
            }
        }
        System.out.println("Lowest Marks: "+min);
    }
    public static void main(String[] args){
        addStudent();
        addStudent();
        addStudent();
        addStudent();
        addStudent();
        displayStudents();
        searchStudent();
        updateMarks();
        displayStudents();
        deleteStudent();
        displayStudents();
        averageMarks();
        highestMarks();
        lowestMarks();
    }
}
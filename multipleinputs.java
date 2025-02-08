import java.util.Scanner;
public class multipleinputs{
    public static void main(String[] args){
        Scanner myObject = new Scanner(System.in);
        System.out.println("Enter name, age and salary: ");
        //Striing input
        String name = myObject.nextLine();
        //Numerical input
        int age = myObject.nextInt();
        double salary = myObject.nextDouble();
        //Output input by user
        System.out.println("Name: " +name);
        System.out.println("Age: " +age);
        System.out.println("Salary: "+salary);
    }
}

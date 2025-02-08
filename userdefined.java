import java.util.Scanner;
public class userdefined {
    public static void main(String args[])
    {
        //Creating Scanner class object
        Scanner scan = new Scanner(System.in);
        System.out.println("Enter the number: ");
        //reading value from the user
        int num = scan.nextInt();
        //method calling
        findEvenOdd(num);
    }

    //user defined method

    public static void findEvenOdd(int num){
        //Method body
        if(num%2==0)
        System.out.println(num +"is even");
        else
        System.out.println(num+"is odd");
    }
    
}

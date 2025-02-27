import java.util.Scanner;//import the Scanner class

public class main{
    public static void main(String[] args){
        Scanner myObj = new Scanner(System.in);//Creat a scanner onbject
        System.out.println("Enter username ");
        String userName = myObj.nextLine();//Read user name
        System.out.println("Username is: " +userName); //Output user Input
    }
}

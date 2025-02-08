import java.util.Scanner; //the scanner class
class scanner{
    public static void main(String[] args){
        Scanner myObject = new Scanner(System.in); //created a scanner object
        System.out.print("\nEnter username: ");
        String userName = myObject.nextLine(); //Read user input
        System.out.println("Username is : " +userName.toLowerCase());
    }
}
import java.util.Scanner;
public class math{
    public static void main(String[] args){
        Scanner character = new Scanner(System.in);
        System.out.println("\nInput any Value to find it's24 squareroot: ");
        int value = character.nextInt();
        System.out.println("The Squareroot of " + value + " = " +Math.sqrt(value));
    }
}
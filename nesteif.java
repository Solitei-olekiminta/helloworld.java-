import java.util.Scanner;
public class nesteif {
    public static void main(String[] args){
        Scanner characters = new Scanner(System.in);
        System.out.print("\nInput the values of I, J and K to determine which amongest them are equal. \nInput I: ");
        double I = characters.nextDouble();
        System.out.println("Input J: ");
        double J = characters.nextDouble();
        System.out.println("Input K: ");
        double K = characters.nextDouble();
        //nested if statement 
        if (I == J){
            if (J == K)
                System.out.print("I is equal to K");
        }
        else{
            System.out.print("I is not equal to J");
        
        }
    }
}
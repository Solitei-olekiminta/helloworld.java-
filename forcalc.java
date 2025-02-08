import java.util.Scanner;
public class forcalc {
    public static void main(String[] args){
        Scanner value = new Scanner(System.in);
        System.out.println("\nInput any character to get it's corresponding multiples: ");
        int character = value.nextInt();
        for(int number = 0; number<=10; number++){
            int results = number * character;
            System.out.println(character +" * " +number +" = " +results);
        }
    }
    
}

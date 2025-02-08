import java.util.Scanner;
public class ifelse {
    public static void main(String[] args){
        Scanner value = new Scanner(System.in);
        System.out.println("\nInput any two value to find out which amongest then is larger than the other.\nResults are based on the first input.\nValue 1: ");
        double value1 = value.nextDouble();
        System.out.println("Value 2: ");
        double value2 = value.nextDouble();

        if (value1 > value2){
            System.out.println("The maximum value is " + Math.max(value1, value2));
        }
        else{
            System.out.println("The minimum value is " +Math.min(value1, value2));

        }

    }
    
}

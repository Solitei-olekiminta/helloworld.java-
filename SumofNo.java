import java.util.Scanner;
public class SumofNo{
    public static void main(String[] args){
        Scanner value = new Scanner(System.in);
        System.out.println("Input Length: ");
        int length = value.nextInt();

        System.out.println("Input width: ");
        int width = value.nextInt();

        int perimeter = 2*(length + width);
        int area = length * width;

        System.out.println("Perimeter: " + perimeter);
        System.out.println("Area: " + area);
    }
}
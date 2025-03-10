class EvenSumCalculator {
    //method to calculate sum of even numbers between o and 200
    public int calculateSum(){
        int sum = 0;
        for( int i = 0; i<=200; i+=2){
            sum +=i;
        }
        return sum;
    }
}

//main class
public class EvenSum {
    public static void main(String[] args){
        //Create an object of EvensumCalculator
        EvenSumCalculator calculator  = new EvenSumCalculator();

        //call method and display result
        int sum = calculator.calculateSum();
        System.out.println("Sum of even numbers between 0 and 200: " +sum);
    }
}

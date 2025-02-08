public class array {
    public static void main(String[] args){
        String[] name = {"peter", "james", "david", "john", "Mighael"};
        System.out.println("\nName: " +name[1]);
        System.out.println("Length: " +name.length);
        int[] numbers =  {1,2,3,4,5};
        System.out.println("Length of the numbers: " +numbers.length);

        System.out.println("Value at position Zero: " +numbers[0]);
        //Changing an array
        numbers[0] = 8;
        System.out.println("New value at position Zero: " +numbers[0]);
    }
    
}

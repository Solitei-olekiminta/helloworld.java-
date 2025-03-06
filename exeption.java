class exception{
    public static void main(String[] args){
        try{
            //Code that generate exception
            int divideByZero = 5/0;
            System.out.println("Rest of code is tryblock");
        }
        catch(ArithmeticException e){
            System.out.println("ArithmeticException is =>" +e.getMessage());
        }
    }
}

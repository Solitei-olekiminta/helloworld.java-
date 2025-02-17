public class instantPuppy{
    int puppyAge;

    public instantPuppy(String name){
        //This constructor has one parameter, name.
        System.out.println("Name chosen is : " +name);
    }

    public void setAge( int age){
        puppyAge = age;
    }

    public int getAge(){
        System.out.println("Puppy's age is: " +puppyAge);
        return puppyAge;
    }

    public static void main(String []args){
        /*Object creation */
        instantPuppy myPuppy = new instantPuppy("Tommy");
        /*Call class method to set puppy's Age */
        myPuppy.setAge(2);

        /*Call another class method to get puppy's age */
        myPuppy.getAge();

        /*You can access instant variables as follows as well */
        System.out.println("Variable value: " +myPuppy.puppyAge);

        
    }
}

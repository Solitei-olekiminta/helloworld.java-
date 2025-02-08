//method1
public String getName()
{
    return name;
}

//method2
public String getBreed()
{
    return breed;
}

//method3
public int getAge()
{
    return age;
}

//method4
public String getColor()
{
    return color;
}w

@Override
public String toString()
{
    return("Hi my name id "+this.getName() + ".\nMy breed, age and color are "+this.getBreed() + "," + this.getAge()+ "," + this.getColor());
}

public static void main(String[] args){
    Dog tuffy new Dog("tuffy", "papillon", 5, "white");
    System.out.println(tuffy.toString());
}
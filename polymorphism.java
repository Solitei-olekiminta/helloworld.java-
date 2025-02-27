 class Shapes{
    public void Shape(){
        System.out.println("How to find the area of the following shapes: ");
    }
}

class Rectangle extends Shapes{
    public void Shape(){
        System.out.println("1. Area of a rectangle is equal to length * width");
    }
}

class Triangle extends Shapes{
    public void Shape(){
        System.out.println("2. Area of a triangle is equal to 0.2 * base * height");
    }
}

class Circle extends Shapes{
    public void Shape(){
        System.out.println("3. Area of a circle is equal to 3.142 * radius * radius");
    }
}

public class polymorphism {
    public static void main(String []args){
        Shapes definition = new Shapes();
        Shapes rectangle = new  Rectangle();
        Shapes triangle = new Triangle();
        Shapes circle = new Circle();

        definition.Shape();
        rectangle.Shape();
        triangle.Shape();
        circle.Shape();
    }
}

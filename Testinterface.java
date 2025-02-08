//interface declaration : by first user
interface Drawable{
    void draw();        
}

//implement : by second user
class Rectangle implements Drawable{
    public void draw(){
        System.out.println("Drawing rectangle");
    }
}

class Circle implements Drawable{
    public void draw(){
        System.out.println("Drawing Cirlce.");
    }
}

//Using interface by third user
public class Testinterface {
    public static void main(String args[]){
        Drawable d = new Circle();
        d.draw();
    }
}

import java.awt.*;

public class TextFieldExample {
    public static void main(String args[]){
        //creating a frame
        Frame f = new Frame("TextField Example");
        TextField t1, t2; //creating object of textfield
        //Instantiating the textfield objects
        //Setting the location of those objects in the frane
        t1 = new TextField("Welcome to Havatpoint.");
        t1.setBounds(50, 100, 200, 30);
        t2 = new TextField("AWT Tutorial");
        t2.setBounds(50, 150, 200, 30);
        //adding the components to frame 
        f.add(t1);
        f.add(t2);
        //Setting sizem layout and vidibility of frame
        f.setSize(400,400);
        f.setLayout(null);
        f.setVisible(true);
    }
}

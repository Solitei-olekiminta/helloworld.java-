import java.awt.*;
public class ButtonExample{
    public static void main(String[] args){
        //create instance of frame with the label
        Frame f = new Frame("Button Example");
        Button b = new Button("Click here"); //Create instance of button with label
        b.setBounds(50,100,50,100); //set the position of the button in the frame
        f.add(b); //add button to the frame
        f.setSize(400,400); //set size, layout and visibility of frame
        f.setLayout(null);
        f.setVisible(true);
    }
}

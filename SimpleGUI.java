import javax.swing.*;
import java.awt.*;
import java.awt.event.*;

public class SimpleGUI {
    public static void main(String[] args){
        JFrame frame = new JFrame("My GUI");
        frame.setSize(300,200);
        frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);   
        frame.setLayout(new FlowLayout());

        JLabel label  = new JLabel("Enter your name: ");
        JTextField textField = new JTextField(15);
        JButton button = new JButton("Submit");

        button.addActionListener(e -> JOptionPane.showMessageDialog(frame, "Hello, " + textField.getText() + "!"));

        frame.add(label);
        frame.add(textField);
        frame.add(button);

        frame.setVisible(true);
    }
}

import java.awt.LayoutManager;
import javax.swing.JButton;
import javax.swing.JFrame;

public class ButtonExample1 {
   public ButtonExample1() {
   }

   public static void main(String[] var0) {
      JFrame var1 = new JFrame("Button Example");
      JButton var2 = new JButton("Click Here");
      var2.setBounds(50, 100, 95, 30);
      var1.add(var2);
      var1.setSize(400, 400);
      var1.setLayout((LayoutManager)null);
      var1.setVisible(true);
   }
}

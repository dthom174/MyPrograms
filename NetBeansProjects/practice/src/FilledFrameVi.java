import javax.swing.JFrame;
import javax.swing.JTextArea;
import javax.swing.JTextField;

public class FilledFrameVi {
    
    public static void main(String[] args)
   {
      JFrame frame = new FilledFrame();
      frame.setTitle("A frame with two components");
      frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
      frame.setVisible(true);
      
   }
      
}

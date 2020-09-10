import javax.swing.*;
import java.awt.*;

public class GUI2 {
    private JPanel rootPanel;

    public static void main(String[] args){
        JFrame frame = new JFrame("Hello World");
        frame.setContentPane(new GUI2().rootPanel);
        frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        frame.pack();
        frame.setVisible(true);
    }

}

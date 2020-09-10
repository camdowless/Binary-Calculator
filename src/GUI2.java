import javax.swing.*;
import java.awt.*;

public class GUI2 {
    private JPanel rootPanel;
    private JButton zeroButton;
    private JButton oneButton;
    private JButton toggleButton;
    private JButton multiplyButton;
    private JButton divideButton;
    private JButton clearButton;
    private JButton equalButton;
    private JButton addButton;
    private JButton subtractButton;
    private JButton squareButton;
    private JButton rootButton;
    private JLabel displayLabel;

    public static void main(String[] args){
        JFrame frame = new JFrame("Hello World");
        frame.setContentPane(new GUI2().rootPanel);
        frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        frame.pack();
        frame.setVisible(true);
    }

}

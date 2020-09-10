import javax.swing.*;
import java.awt.*;

public class GUI {

    public GUI() {

        JFrame frame = new JFrame();

        JButton button = new JButton("Tester");
        JLabel label = new JLabel("Hello World");

        JPanel panel = new JPanel();
        panel.setBorder(BorderFactory.createEmptyBorder(30, 30, 10, 30));
        panel.setLayout(new GridLayout());
        panel.add(button);
        panel.add(label);

        frame.add(panel, BorderLayout.CENTER);
        frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        frame.setTitle("Baby's First GUI");
        frame.pack();
        frame.setVisible(true);

    }

    public static void main(String[] args){
        new GUI();
    }
}
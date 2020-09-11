import javax.swing.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

public class GUI {
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

    //dummy values used until backend is attached//
    private int num;
    private int result = 8;

    public GUI() {
        zeroButton.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                displayLabel.setText("0");
                num = 0;

                //making sure it works in console//
                System.out.println(num);
            }
        });
        oneButton.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                displayLabel.setText("1");
                num = 1;

                //making sure it works in console//
                System.out.println(num);
            }
        });
        clearButton.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                displayLabel.setText("Cleared");
                num = 0;

                //making sure it works in console//
                System.out.println(num);
            }
        });
        equalButton.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                displayLabel.setText(String.valueOf(result));

                //making sure it works in console//
                System.out.println(result);
            }
        });
        squareButton.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                displayLabel.setText("x^2");

                //making sure it works in console//
                System.out.println(result * result);
            }
        });
    }

    public static void main(String[] args){
        JFrame frame = new JFrame("Binary Calculator");
        frame.setContentPane(new GUI().rootPanel);
        frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        frame.pack();
        frame.setSize(500,500);
        frame.setVisible(true);
    }

}

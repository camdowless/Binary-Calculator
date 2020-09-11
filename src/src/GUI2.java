import javax.swing.*;
import java.awt.*;
import java.awt.event.ActionListener;

public class GUI2 {
    BinaryCalculation calculator = new BinaryCalculation();

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

    private String n1 = "";
    private String n2 = "";
    private boolean IsDisplayBinary = false;
    private int answer;
    private int currentNum = 1;

    private GUI2(){
        displayLabel.setText("");

        toggleButton.addActionListener(e -> {
            /*
            IsDisplayBinary starts off as False, so the first hit of the toggle button will switch to binary,
            Which then sets IsDisplayBinary to True.
             */
            toggle();
            IsDisplayBinary = !IsDisplayBinary;
        });

        addButton.addActionListener(e -> {
            /*
            When an operation button is pressed, N1 is sent to the BinaryCalculation class,
            The operation is set,
            and the label displays the operation sign.

            We also set the currentNum to 2 so the program knows to set the next input to N2
            */
            calculator.setN1(n1);
            displayLabel.setText("+");
            calculator.setOperation(BinaryCalculation.Operation.ADD);
            currentNum = 2;
        });

        subtractButton.addActionListener(e -> {
            calculator.setN1(n1);
            displayLabel.setText("-");
            calculator.setOperation(BinaryCalculation.Operation.SUBTRACT);
            currentNum = 2;
        });

        multiplyButton.addActionListener(e -> {
            calculator.setN1(n1);
            displayLabel.setText("*");
            calculator.setOperation(BinaryCalculation.Operation.MULTIPLY);
            currentNum = 2;
        });

        divideButton.addActionListener(e -> {
            calculator.setN1(n1);
            displayLabel.setText("/");
            calculator.setOperation(BinaryCalculation.Operation.DIVIDE);
            currentNum = 2;
        });

        squareButton.addActionListener(e -> {
            /*
            Square & square root are different as they only require 1 value. We go straight to the calculation
             */
            calculator.setN1(n1);
            calculator.setOperation(BinaryCalculation.Operation.SQUARE);
            calculate();
        });

        rootButton.addActionListener(e ->{
            calculator.setN1(n1);
            calculator.setOperation(BinaryCalculation.Operation.SQRT);
            calculate();
        });


        equalButton.addActionListener(e -> {
            calculator.setN2(n2);
            calculate();
        });

        clearButton.addActionListener(e -> {
            currentNum = 1;
            n1 = "";
            n2 = "";
            answer = 0;
            displayLabel.setText("");
            calculator.reset();
        });

        oneButton.addActionListener(e -> addOne());
        zeroButton.addActionListener(e -> addZero());

    }

    public static void main(String[] args){
        JFrame frame = new JFrame("Binary Calculator");
        frame.setContentPane(new GUI2().rootPanel);
        frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        frame.pack();
        frame.setVisible(true);

    }
    private void addOne(){
        /*
        Checks to see if the program should add the 1 to N1 or N2, depending on the currentNum variable
         */
        if (currentNum == 1){
            n1 = n1 + "1";
            displayLabel.setText(n1);
        }
        else if (currentNum == 2){
            n2 = n2 + "1";
            displayLabel.setText(n2);
        } else {
            System.err.println("Error");
        }
    }
    private void addZero(){
        /*
        Checks to see if the program should add the 0 to N1 or N2, depending on the currentNum variable
         */
        if (currentNum == 1){
            n1 = n1 + "0";
            displayLabel.setText(n1);
        }
        else if (currentNum == 2){
            n2 = n2 + "0";
            displayLabel.setText(n2);

        } else {
            System.err.println("Error");
        }
    }

    private void calculate(){
        /*
        Saves the answer into a variable, used for the toggle function
         */
        answer = calculator.calculate();
        displayLabel.setText(Integer.toString(answer));
    }

    private void toggle(){
        /*
        If the calculator is currently displaying the answer in binary form, simply change the displayLabel to the answer variable
         */
        if(IsDisplayBinary){
            displayLabel.setText(Integer.toString(answer));
        } else {
            /*
            If displaying the decimal form, pass it through the toBinary function.
            Use absolute value to get the same number if it's negative or positive,
            then check if negative at the end.

            If it's negative, just add a - to the display text
             */
            String converted = toBinary(Math.abs(answer));
            if(answer < 0) {
                displayLabel.setText("-" + converted);
            }else{
                displayLabel.setText(converted);
            }
        }
    }

    private String toBinary(int decimal){
        int[] binary = new int[50];
        int index = 0;
        StringBuilder binaryString = new StringBuilder();
        while(decimal > 0){
            binary[index++] = decimal % 2;
            decimal = decimal / 2;
        }
        for(int i = index - 1; i >= 0; i--){
            binaryString.append(binary[i]);
        }
        return binaryString.toString();
    }
}

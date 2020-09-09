import java.util.NoSuchElementException;

public class BinaryCalculation {
    private enum Operation {
        ADD, SUBTRACT, MULTIPLY, DIVIDE, SQUARE, SQRT
    }

    private int n1;
    private int n2;
    private Operation op;

    BinaryCalculation(){}

    public void setN1(String binaryString){
        /*
        Converts the binary string input into a base 2 integer and sets n1
         */
        this.n1 = Integer.parseInt(binaryString, 2);
    }

    public void setN2(String binaryString){
        /*
        Same thing for n2
         */
        this.n2 = Integer.parseInt(binaryString, 2);
    }

    public void setOperation(String operationString){
        /*
        Converts string input, either "+", "-", "*", "/" to an Operation enum
        */
        switch(operationString){
            case "+":
                op = Operation.ADD;
                break;
            case "-":
                op = Operation.SUBTRACT;
                break;
            case "*":
                op = Operation.MULTIPLY;
                break;
            case "/":
                op = Operation.DIVIDE;
                break;
            case "^":
                op = Operation.SQUARE;
                break;
            case "%":
                op = Operation.SQRT;
                break;
            default:
                throw new NoSuchElementException();
        }
    }

    public int calculate(){
        //TODO: Implement functionality
        return 0;
    }

    public void reset(){
        //Called after calculate() and the answer is displayed on the screen.
        n1 = 0;
        n2 = 0;
        op = null;
    }
}
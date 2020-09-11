public class BinaryCalculation {
    public enum Operation {
        ADD, SUBTRACT, MULTIPLY, DIVIDE, SQUARE, SQRT, RESET
    }

    private int n1;
    private int n2;
    private boolean n1_set = false;
    private boolean n2_set = false;
    private Operation op;

    BinaryCalculation(){}

    void setN1(String binaryString){
        /*
        Converts the binary string input into a base 2 integer and sets n1
         */
        if(!binaryString.equals("")) {
            this.n1 = Integer.parseInt(binaryString, 2);
            this.n1_set = true;
        }
    }

    void setN2(String binaryString){
        /*
        Same thing for n2
         */
        if(!binaryString.equals((""))) {
            this.n2 = Integer.parseInt(binaryString, 2);
            this.n2_set = true;
        }
    }

    void setOperation(Operation o){
        /*
        Converts string input, either "+", "-", "*", "/" to an Operation enum
        */
        if(n1_set & !n2_set){
            op = o;
        }
    }

    int calculate(){
        switch(op){
            case ADD:
                return n1 + n2;
            case SUBTRACT:
                return n1 - n2;
            case MULTIPLY:
                return n1 * n2;
            case DIVIDE:
                return n1 / n2;
            case SQUARE:
                return n1 * n1;
            case SQRT:
                return (int)(Math.sqrt(n1));
        }
        return 0;
    }

    void reset(){
        //Called after calculate() and the answer is displayed on the screen.
        n1 = 0;
        n2 = 0;
        op = Operation.RESET;
        n1_set = false;
        n2_set = false;
    }

    int getN1(){
        return n1;
    }
    int getN2(){
        return n2;
    }
}
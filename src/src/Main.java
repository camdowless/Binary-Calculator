public class Main{
    public static void main(String[] args) {
        BinaryCalculation c = new BinaryCalculation();
        c.setN1("0101");
        c.setN2("0010");
        c.setOperation("+");

        System.out.println(c.getN1());
        System.out.println(c.getN2());

    }
}

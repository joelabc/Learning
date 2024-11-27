package OOPS.Calculator;


public class Inheritance {
    public static void main(String[] args) {
        VAdvCalc c1 = new VAdvCalc();
        int r1 = c1.add(10,12);
        int r2 = c1.sub(12,112);
        int r3 = c1.prod(10,112);
        int r4 = c1.div(10,2);
        double r5 = c1.power(10,5);

        System.out.println(r1 + " " + r2 + " " + r3 + " " + r4 + " " + r5);

    }
}

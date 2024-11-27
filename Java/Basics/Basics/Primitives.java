package Basics;

public class Primitives {
    public static void main(String[] args) {
        int num =2;
        Integer num1 = num;
        // boxing: taking a primitive value and storing it in an wrapper object

        System.out.println(num1);
        int num2 = num1.intValue();
        //when it happens automatically it is called auto boxing

        System.out.println(num2);
        //UNBOXING converting obj to primitive
        //doing this automatically is autounboxing


        String str = "12";
        int num3 = Integer.parseInt(str);

        System.out.println(num3 * 10);

    }
}

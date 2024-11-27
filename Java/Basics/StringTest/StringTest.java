package StringTest;

public class StringTest {
    public static void main(String[] args) {
        String string = "automobile";
        System.out.println("Hello " + string);
        System.out.println(string.hashCode());

        System.out.println(string.charAt(1));


        StringBuffer sb = new StringBuffer("joel");
        System.out.println(sb.capacity());
        System.out.println(sb.length());

//        String str = sb; //unable to type
        String str = sb.toString();
        System.out.println(str);

        sb.append("Abraham");
        System.out.println(sb);
        sb.deleteCharAt(1);
        System.out.println(sb);
        sb.reverse();
        System.out.println(sb);

        sb.insert(1,"asd");;
        System.out.println(sb);

    }
}

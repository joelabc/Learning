package OOPS.AccessModifiers;
import OOPS.AccessModifiers.Levels.B;

class C extends B{
    public int getMarks(){
        return this.marks;
    }
}


public class Access {
    public static void main(String[] args) {
        B b = new B();
//        System.out.println(b.marks);

        C c = new C();
        c.getMarks();

        A a = new A();
        System.out.println(a.marks);
        System.out.println(c.getMarks());

    }


}

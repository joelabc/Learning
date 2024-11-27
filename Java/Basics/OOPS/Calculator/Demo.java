package OOPS.Calculator;

class A{
    public void show(){
        System.out.println("in A show");
    }
    public void config(){
        System.out.println("in A config");
    }
}
class B extends A{
    public void show(){
        System.out.println("in B show");
    }
}
//class C extends B{ // extends A multiple inheritance is not supported in Java
//
//}
class Calc1{
    public int add(int n1, int n2){
        return n1 + n2;
    }

}


class Calc2 extends Calc1{
    public int add(int n1, int n2){
        return n1 + n2 +1;
    }

}

public class Demo {

    public static void main(String[] args) {
//        B a = new B();
//        a.show();
//        a.config();
        Calc2 c1 = new Calc2();
        System.out.println(c1.add(10,20));
    }
}


package Keywords;



class A{
    public void show1(){
        System.out.println("In A");
    }

}

class B extends A{
    public void show2(){
        System.out.println("In B");
    }

}

public class Typecasting {
    public static void main(String[] args) {
        A a1 = new A();
        a1.show1();


        A a2 = (A) new B(); //upcasting where we are creating an object of the subclass and then converting it manually to the superclass
//        a2.show2(); //it cannot scope show2 as it does not know who it is

        // we can type cast another object and accomplish this
        // this is called down casting where we are casting the parent class to the child class
        B b1 = (B) a2;
        b1.show2();
    }
}

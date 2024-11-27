package OOPS;


class a{
    public a(){
        System.out.println("In A Constructor");
    }
    public a(int a){
        System.out.println("in A int");
    }

}


class b extends a{
    public b(){
        System.out.println("In B Constructor");
    }

    public b(int b){
        super(b);
        System.out.println("in B int");
    }
}



public class ThisAndSuper {
    public static void main(String[] args) {
        b b = new b();
        b b1 = new b(10);
    }
}

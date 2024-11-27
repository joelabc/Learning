package Keywords;


 class Calc{
    public final void show(){
        System.out.println("NOT SO FAST");
    }
    public void add(int n1, int n2){
        System.out.println(n1+n2);
    }
}

//class AdvCalc extends Calc{ //final classes cannot be inherited
//
//}

class AdvCalc extends Calc { //final classes cannot be inherited


//    public void show() { //cannot overrid final
//        System.out.println("YEAH BOY");
//    }
//}

    public class Final {
        public static void main(String[] args) {

            int num = 8;
            num = 9;
            System.out.println(num);

            AdvCalc c1 = new AdvCalc();
            c1.show();
            c1.add(10, 20);
        }

    }
}

 package Keywords;

abstract class Car{ //abstract class
    public abstract void drive();
    public void music(){
        System.out.println("Play Music");
    }
}

class WagonR extends Car{ //concrete class
    public void drive(){
        //an empty method and it is not implementing anything
        System.out.println("Driving");
    }
}

public class Abstract {
    public static void main(String[] args) {
        Car c = new WagonR();
        c.drive();
        c.music();
    }
}

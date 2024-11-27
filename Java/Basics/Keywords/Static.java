package Keywords;




class Mobile   {
    String brand;
    int price;
    String model;
    static String type;

    static{
        type="phone";
        System.out.println("static");
    }

    public void show(){
        System.out.println(brand + "  " + price + "  " + model);}

    public static void show1(Mobile m1){
        System.out.println(m1.brand + "  " + m1.price + "  " + m1.model);
        System.out.println("static method");
    }

    public Mobile(){
        brand="";
        price=200;
        System.out.println("Constructor");
    }

}
public class Static {
    public static void main(String[] args) throws ClassNotFoundException {


//        Class.forName("Static.Mobile");//loads the specific class, system class loader is used

        Mobile m1 = new Mobile();
        m1.brand="Moto";
        m1.price=23000;
        m1.model="Edge 50 Neo";

        Mobile m2 = new Mobile();
        m2.brand="Google";
        m2.price=63000;
        m2.model="Pixel 12";

        m1.show();
        m2.show();
        Mobile.show1(m1);

    }
}

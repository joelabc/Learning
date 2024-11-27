package OOPS;



class Human{
    private String name;
    private int age;
    private static String species = "Homo Sapiens";
    private String ID = "SUPER SECRET ID";
// all the instance variables are to be declared as private and only accessed via getters and setters
    public void show(Human h1){
        System.out.println(h1.age + "  " + h1.name + "  " + species);
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public int getAge() {
        return age;
    }

    public void setAge(int age) {
//        age = age;// preference is always give to local variable
        this.age = age;
    }
// This keyword should be used inorder to use the same names and if we donot it will take the latest scoped values

    public static String getSpecies() {
        return species;
    }

    public static void setSpecies(String species) {
        Human.species = species;
    }

    public String getID() {
        return ID;
    }

    public void setID(String ID) {
        this.ID = ID;
    }

    public Human(){ //default constructor
        System.out.println("in Constructor");
        age= 30;
        name = "John Doe";
    }
    public Human(int age, String name, String ID){//parameterized constructor
        this.age=age;
        this.name=name;
        this.ID=ID;

    }
}

public class Encpsulation {

    public static void main(String[] args) {
        Human h1 = new Human();

        h1.setName("Joel");
        h1.setAge(26);
        h1.setID("27");
        System.out.println(h1.getName());
        System.out.println(h1.getAge());
        System.out.println(h1.getID());
        System.out.println(Human.getSpecies());

        Human h2 = new Human(20,"Young Joe","SuperSecret ID");

        System.out.println(h2.getAge()+ "  " + h2.getID() + "  " + h2.getName() + "  " + Human.getSpecies());

    }
}

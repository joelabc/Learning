package Loops;
public class Loops {
  public static void main(String[] args) {
    // System.out.println("Hi");
    // System.out.println("Hi");
    // System.out.println("Hi");
    // System.out.println("Hi");
    int n = 10;
    while (n > 0) {
      // System.out.println("Hi " + n);
      n--;
    }

    do {
      System.out.println("Hi " + n);
      n += 10;

    } while (n < 100);
    System.out.println(n);

    for (int i = 0; i < 10; i++) {
      // System.out.println("Hi");

    }

  }
}

package LowestofThree;
public class LowestOf3 {
  public static void main(String[] args) {
    int num1 = 110;
    int num2 = 11;
    int num3 = 2;

    if (num1 < num2 && num1 < num3)
      System.out.println(num1 + " is the lowest");
    else if (num2 < num3)
      System.out.println(num2 + " is the lowest");
    else
      System.out.println(num3 + " is the lowest");
  }

}

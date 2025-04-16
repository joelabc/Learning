package Basics;
class Basics {
  public static void main(String[] args) {





    
    // int a = 1220;
    // int b = 20;
    // int result = a + b;
    // System.out.println(result);

    // byte by = 127;
    // short sh = 500;
    // float fl = 5.8f;
    // double d = 5.6;
    // boolean bool = true;
    // long l = 100l;

    // // literals
//    int num1 = 110;
//    int num2 = 11;
//    int num3 = 2;

    // int result = num1++;
    // System.out.print(result);
    // // System.out.print(num1);

//    boolean result = num1 >= num2;
//    result = num2 > num1 || num3 > num1;
//    // System.out.println(result);
//
//    if (num1 < num2 && num1 < num3)
//      System.out.println(num1 + " is the lowest");
//    else if (num2 < num3)
//      System.out.println(num2 + " is the lowest");
//    else
//      System.out.println(num3 + " is the lowest");
//
//    result = num1 < num2 ? true : false;
//    System.out.println(result);


  int nums[] = new int[5];

  for(int i=0; i<5; ++i)
    nums[i] = (int) (Math.random() * 100);

  for(int n : nums)
    System.out.println(n);



  }
}
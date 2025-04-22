package Java.Course;

import java.util.Scanner;

public class patterns {
    public static void main(String[] args) {
        String c = "*";
        Scanner userInput = new Scanner(System.in);
        System.out.println("Enter the height of the tree: ");
        int n = userInput.nextInt();

        System.err.println("Right Pyramid");
        for (int i = 0; i < n; i++) {
            for (int k = i; k <= n - 1; k++) {
                System.err.print(" "); // can use println(c.repeat(i))
            }
            for (int j = 0; j < i + 1; j++) {
                System.err.print(c); // can use println(c.repeat(i))
            }
            System.err.println();
        }

        System.err.println("Inverted Right Pyramid");
        for (int i = n; i >= 1; i--) {
            for (int k = i; k <= n - 1; k++) {
                System.err.print(" "); // can use println(c.repeat(i))
            }
            for (int j = 1; j < i + 1; j++) {
                System.err.print(c); // can use println(c.repeat(i))
            }
            System.err.println();
        }

        System.err.println("Left Pyramid");
        for (int i = 0; i < n; i++) {
            for (int j = 1; j <= i + 1; j++) {
                System.err.print(c); // can use println(c.repeat(i))
            }
            System.err.println();
        }

        System.err.println("Inverted Left Pyramid");
        for (int i = n; i > 0; i--) {
            for (int j = i; j > 0; j--) {
                System.err.print(c);
            }
            System.err.println();
        }

        System.err.println("Proper Pyramid");
        for (int i = 1; i <= n; i++) {
            for (int k = 1; k <= n - i; k++) {
                System.err.print(" ");
            }

            for (int j = 1; j <= i * 2 - 1; j++) {
                System.err.print("*");
            }
            System.err.println();

        }
        System.err.println("Inverted Proper Pyramid");
        for (int i = n; i >= 0; i--) {
            for (int k = 1; k <= n - i; k++) {
                System.err.print(" ");
            }

            for (int j = 1; j <= i * 2 - 1; j++) {
                System.err.print("*");
            }
            System.err.println();

        }
        userInput.close();

    }

}

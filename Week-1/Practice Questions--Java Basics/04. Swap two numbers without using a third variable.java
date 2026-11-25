4. Swap two numbers without using a third variable

public class SwapNumbers {
    public static void main(String[] args) {
        int a = 10;
        int b = 20;

        System.out.println("Before swapping:");
        System.out.println("a = " + a);
        System.out.println("b = " + b);

        a = a + b;
        b = a - b;
        a = a - b;

        System.out.println("After swapping:");
        System.out.println("a = " + a);
        System.out.println("b = " + b);
    }
}



Output:
Before swapping:
a = 10
b = 20
After swapping:
a = 20
b = 10


Logic:
- a = a + b → 30
- b = a - b → 10
- a = a - b → 20
Note: This addition method can overflow for very large integers.

5. Print a multiplication table using a loop

import java.util.Scanner;

public class MultiplicationTable {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.print("Enter a number: ");
        int num = sc.nextInt();

        for (int i = 1; i <= 10; i++) {
            System.out.println(num + " x " + i + " = " + (num * i));
        }

        sc.close();
    }
}



Output:
Enter a number: 5
5 x 1 = 5
5 x 2 = 10
5 x 3 = 15
5 x 4 = 20
5 x 5 = 25
5 x 6 = 30
5 x 7 = 35
5 x 8 = 40
5 x 9 = 45
5 x 10 = 50


Logic: The for loop runs from 1 to 10 and multiplies the entered number by each value.

How to run these programs
1. Open IntelliJ IDEA, Eclipse, or VS Code.
2. Create a Java project.
3. Create a separate Java class for each program.
4. Make sure the class name matches the filename.
5. Run each program.
Note: Save each program in its own .java file because each program has a different public class name.












This might also interest you.


Ad
Ad options



Learn more









Ads do not influence the answers you get from ChatGPT. Your chats stay private. Learn about ads and personalization

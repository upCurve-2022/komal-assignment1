import java.util.Scanner;
public class swap_three {

    public static void main(String[] args) {

        int a, b, c, t;

        System.out.println("Please enter the value of a");

        Scanner sc = new Scanner(System.in);

        a = sc.nextInt();

        System.out.println("You have entered the value of a:" + a);

        System.out.println("Please enter the value of b");

        b = sc.nextInt();


        System.out.println("You have entered the value of b:" + b);

        System.out.println("Please enter the value of c");

        c = sc.nextInt();

        System.out.println("You have entered the value of c:" + c);

   /* System.out.println("Before swap the value of a is" + a);

    System.out.println("Before swap the value of b is\t" + b);

    System.out.println("Before swap the value of c is\t" + c);

    System.out.println("Swapping start from here"); */

        t = a;

        a = b;

        b = c;

        c = t;

        System.out.println("After swap the value of a is " + a);

        System.out.println("After swap the value of b is " + b);

        System.out.println("After swap the value of c is " + c);
    }
}



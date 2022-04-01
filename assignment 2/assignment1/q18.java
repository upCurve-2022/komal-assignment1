import java.nio.channels.ScatteringByteChannel;
import java.sql.SQLOutput;
import java.util.Scanner;

public class q18
{

    static int factorial(int num)
    {
        if (num == 0)
            return 1;

        return num*factorial(num-1);
    }

    public static void main(String[] args)
    {   int num;
        System.out.println("Enter number: " );
        Scanner sc= new Scanner(System.in);
        num=sc.nextInt();
        System.out.println("Factorial of "+ num + " is " + factorial(num));
    }


}

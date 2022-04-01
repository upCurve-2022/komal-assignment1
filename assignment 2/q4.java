import java.util.Scanner;

public class q4{

    public static void main(String[] args)
    {
        Scanner sc = new Scanner(System.in);
        System.out.print("enter c");
        char c = (char) sc.nextInt();


        int ascii = (int)c;
        System.out.println("The ASCII value of " + c + " is: " + ascii);
    }
}




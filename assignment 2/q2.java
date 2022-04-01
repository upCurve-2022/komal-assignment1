import java.util.*;

public class q2{
    public static void main(String args[])
    {
        System.out.println("Enter height");
        Scanner s = new Scanner(System.in);
        int height = s.nextInt();

        System.out.println("Enter radius");
        Scanner sc = new Scanner(System.in);
        int radius = sc.nextInt();


        double pie=3.1428;
        double volume=pie*(radius*radius)*height;
        System.out.println("Volume of the cylinder="+volume);
    }
}

import java.util.Scanner;

import java.util.*;
public class q13 {

    public static void main(String arg[])
    {
        Scanner sc= new Scanner(System.in);
        System.out.println("Enter number of terms: ");
        int n= sc.nextInt();

        int i,j,result;
        System.out.println("Series is : ");
        for (i=1;i<n;i++)
        {
            result=1;
            for (j=1;j<=i;j++)
            {
                result=result*i;
            }
            System.out.println(result);
        }

    }

}


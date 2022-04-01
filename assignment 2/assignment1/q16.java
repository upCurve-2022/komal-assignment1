import java.util.Scanner;
public class q16
{
    public static void main(String[] args)
    {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter the number of terms : ");
        int n = sc.nextInt();
        int i = 1, j=1;


            while(i <= n)
            {
                if(j%3!=0)
                {
                    System.out.print(i + " ");
                    i = i+4*j;
                }
                j++;
            }


    }
}


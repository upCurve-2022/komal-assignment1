import java.util.Scanner;
public class q17 {
    public static void main(String[] args)
    {
        Scanner sc = new Scanner(System.in);
        int m, n, i, j, flag;


        System.out.printf("Enter m: ");
        m = sc.nextInt();


        System.out.printf("\nEnter n: ");
        n = sc.nextInt();


        System.out.printf("\nOutput: ");

        // Traverse each number in the interval
        // with the help of for loop
        for (i = m; i <= n; i++) {
            if (i == 1 || i == 0)
                continue;

            flag = 1;

            for (j = 2; j <= i / 2; ++j) {
                if (i % j == 0) {
                    flag = 0;
                    break;
                }
            }


            if (flag == 1)
                System.out.println(i);
        }
    }
}


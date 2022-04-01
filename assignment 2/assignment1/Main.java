import java.util.*;
    public class Main {
        public static void main(String[] args) {
            //creating object of Scanner class
            Scanner sc = new Scanner(System.in);
            System.out.println("Enter the Nth term ");
            int n = sc.nextInt();

            for (int i = 2; i <= 2 * n; i += 2) {
                int result = (i * i);
                System.out.print(result + " ");
            }
        }
    }



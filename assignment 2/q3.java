import java.util.Scanner;

public class q3{

    public static void main(String[] args) {
        int price;
        int discount;

        Scanner sc = new Scanner(System.in);

        System.out.println("Enter price of the product :");
        price = sc.nextInt();

        System.out.println("Enter Discount of the product :");
        discount = sc.nextInt();

        int finalPrice = (price * discount) / 100;

        System.out.println("Final price is " + finalPrice);
    }
}


import java.util.Arrays;
import java.util.stream.IntStream;

class q28 {

    private static void check(int[] arr, int toCheckValue)
    {
        boolean test = false;
        for (int element : arr) {
            if (element == toCheckValue) {
                test = true;
                break;
            }
        }


        System.out.println(test);
    }

    public static void main(String[] args)
    {


        int arr[] = { 1,2,3,4,5,6,7,8};


        int toCheckValue = 7;

        System.out.println("Array: "
                + Arrays.toString(arr));

        check(arr, toCheckValue);
    }
}

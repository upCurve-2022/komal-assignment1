public class q24 {

        static int pow(int a, int b)
        {
            if (b == 0)
                return 1;

            int answer = a;
            int increment = a;
            int i, j;

            for (i = 1; i < b; i++) {
                for (j = 1; j < a; j++) {
                    answer += increment;
                }
                increment = answer;
            }

            return answer;
        }

        public static void main(String[] args)
        {
            System.out.println(pow(2, 5));
        }
    }


public class q5 {

    public static int stringCompare(String str1, String str2)
    {

        int l1 = str1.length();
        int l2 = str2.length();
        int lmin = Math.min(l1, l2);

        for (int i = 0; i < lmin; i++) {
            int str1_ch = (int)str1.charAt(i);
            int str2_ch = (int)str2.charAt(i);

            if (str1_ch != str2_ch) {
                return str1_ch - str2_ch;
            }
        }

        if (l1 != l2) {
            return l1 - l2;
        }

        else {
            return 0;
        }
    }

    public static void main(String args[])
    {
        String string1 = new String("Target");
        String string2 = new String("Up curve");
        String string3 = new String("program");
        String string4 = new String("Target");

        System.out.println( string1 + " and " + string2
                + " = " + stringCompare(string1, string2));


        System.out.println(string3 + " and " + string4
                + " = " + stringCompare(string3, string4));

        System.out.println( string1 + " and " + string4
                + " = " + stringCompare(string1, string4));
    }
}

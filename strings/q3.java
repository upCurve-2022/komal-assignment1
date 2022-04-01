class q3 {

    public static boolean isStringEmpty(String str)
    {
        if (str.isEmpty())
            return true;
        else
            return false;
    }

    public static void main(String[] args)
    {
        String str1 = "Target";
        String str2 = "";

        System.out.println(str1+ " " + isStringEmpty(str1));
        System.out.println(str2 +" "+ isStringEmpty(str2));
    }
}

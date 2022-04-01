

class q6
{

    static String replaceSpace(String str)
    {

        String s = "";


        for (int i = 0; i < str.length(); ++i) {


            if (str.charAt(i) == '-')
                s += " ";

            else
                s += str.charAt(i);

        }


        return s;


    }


    public static void main(String []args)
    {


        String str = "Target-Upcurve-Program";

        System.out.println(replaceSpace(str));


    }

}
